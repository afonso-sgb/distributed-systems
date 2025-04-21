package tm;

import clienttm.ClientTMContractGrpc;
import clienttm.Clienttmcontract.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import tmservector.TMSerVectorContractGrpc;
import tmservector.Tmservectorcontract;
import tplm.TPLMProto;
import tplm.TPLMServiceGrpc;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;

class TM {
    private static String TMIpAddress;
    private static int TMPort;
    private static String TPLM_IP = "localhost";
    private static int TPLM_PORT = 6000;

    private static Map<String, List<String>> clientsAndServers = new HashMap<>();
    private static Map<String, List<String>> clientsAndResources = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
        getAddress(args);
        startTM();
    }

    private static void getAddress(String[] args) throws Exception {
        if (args.length == 2) {
            TMIpAddress = args[0];
            TMPort = Integer.parseInt(args[1]);
        } else {
            throw new Exception("Number of parameter not valid, please pass IP and Port!");
        }
    }

    private static void startTM() {
        try {
            io.grpc.Server managerServer = ServerBuilder
                    .forPort(TMPort)
                    .addService(new TMClient())
                    .addService(new TMSerVector())
                    .build();

            managerServer.start();
            System.out.println("TM up!\nAddress: " + TMIpAddress + "\nListening on Port: " + TMPort);

            managerServer.awaitTermination();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static ManagedChannel createChannel(String ip, int port) {
        return ManagedChannelBuilder.forAddress(ip, port).usePlaintext().build();
    }

    public static class TMClient extends ClientTMContractGrpc.ClientTMContractImplBase {
        @Override
        public void getTransactionID(GetTransactionIDRequest request, StreamObserver<GetTransactionIDResponse> responseObserver) {
            String generatedUUID = UUID.randomUUID().toString();
            clientsAndServers.putIfAbsent(generatedUUID, new ArrayList<>());
            clientsAndResources.putIfAbsent(generatedUUID, new ArrayList<>());

            GetTransactionIDResponse response = GetTransactionIDResponse.newBuilder().setTransactionID(generatedUUID).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("Generated ID was: " + generatedUUID);
        }

        @Override
        public void endTransaction(EndTransactionRequest request, StreamObserver<EndTransactionResponse> responseObserver) {
            String clientID = request.getClientID();
            List<String> serversForClientID = clientsAndServers.getOrDefault(clientID, Collections.emptyList());
            List<String> serversCopy = new ArrayList<>(serversForClientID); // avoid ConcurrentModification

            List<Boolean> prepare = new ArrayList<>();
            for (String server : serversCopy) {
                String[] parts = server.split(":");
                ManagedChannel channel = createChannel(parts[0], Integer.parseInt(parts[1]));
                var stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                var response = stub.prepare(Tmservectorcontract.PrepareRequest.newBuilder().build());
                prepare.add(response.getReady());
                channel.shutdown();
            }

            boolean abort = prepare.contains(false);

            for (String server : serversCopy) {
                String[] parts = server.split(":");
                ManagedChannel channel = createChannel(parts[0], Integer.parseInt(parts[1]));
                var stub = TMSerVectorContractGrpc.newBlockingStub(channel);

                if (abort) {
                    stub.abort(Tmservectorcontract.AbortRequest.newBuilder().build());
                } else {
                    stub.commit(Tmservectorcontract.CommitRequest.newBuilder().build());
                }
                channel.shutdown();
            }

            // Liberar locks via TPLM
            List<String> resources = clientsAndResources.getOrDefault(clientID, Collections.emptyList());
            for (String res : new ArrayList<>(resources)) {
                ManagedChannel tplmChannel = createChannel(TPLM_IP, TPLM_PORT);
                var tplmStub = TPLMServiceGrpc.newBlockingStub(tplmChannel);
                tplmStub.unlock(TPLMProto.UnlockRequest.newBuilder()
                        .setTransactionID(clientID)
                        .setResourceID(res)
                        .build());
                tplmChannel.shutdown();
            }

            EndTransactionResponse res = EndTransactionResponse.newBuilder()
                    .setTransactionCommited(!abort)
                    .setMessage(abort ? "The transaction was aborted." : "The transaction was committed.")
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
    }

    public static class TMSerVector extends TMSerVectorContractGrpc.TMSerVectorContractImplBase {
        @Override
        public void addServerToCommit(Tmservectorcontract.AddServerRequest request, StreamObserver<Tmservectorcontract.AddServerResponse> responseObserver) {
            String clientID = request.getClientID();
            String server = request.getServectorIP() + ":" + request.getServectorPort();
            String resourceID = server + ":" + request.getResourceID();

            // Verifica se já foi adicionado
            if (clientsAndResources.getOrDefault(clientID, Collections.emptyList()).contains(resourceID)) {
                System.out.println("TM: Resource " + resourceID + " already registered, skipping lock.");
            } else {
                // === TPLM LOCK ===
                ManagedChannel tplmChannel = createChannel(TPLM_IP, TPLM_PORT);
                var tplmStub = TPLMServiceGrpc.newBlockingStub(tplmChannel);

                TPLMProto.LockRequest lockReq = TPLMProto.LockRequest.newBuilder()
                        .setTransactionID(clientID)
                        .setResourceID(resourceID)
                        .build();

                TPLMProto.LockResponse lockRes = tplmStub.lock(lockReq);
                tplmChannel.shutdown();

                if (!lockRes.getSuccess()) {
                    Tmservectorcontract.AddServerResponse response = Tmservectorcontract.AddServerResponse
                            .newBuilder()
                            .setSuccess(false)
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                    System.out.println("TM: Lock failed for resource " + resourceID);
                    return;
                }
            }

            // Adiciona apenas se ainda não existir
            clientsAndServers.computeIfAbsent(clientID, k -> new ArrayList<>());
            if (!clientsAndServers.get(clientID).contains(server)) {
                clientsAndServers.get(clientID).add(server);
            }

            clientsAndResources.computeIfAbsent(clientID, k -> new ArrayList<>());
            if (!clientsAndResources.get(clientID).contains(resourceID)) {
                clientsAndResources.get(clientID).add(resourceID);
            }

            Tmservectorcontract.AddServerResponse response = Tmservectorcontract.AddServerResponse
                    .newBuilder()
                    .setSuccess(true)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("Current clientsAndServers: " + clientsAndServers);
        }
    }
}
