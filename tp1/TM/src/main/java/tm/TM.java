package tm;

import clienttm.ClientTMContractGrpc;
import clienttm.Clienttmcontract.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import tmservector.TMSerVectorContractGrpc;
import tmservector.Tmservectorcontract;
import tplm.TPLMProto;
import tplm.TPLMServiceGrpc;

import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Long.MAX_VALUE;

class TM {
    private static String TMIpAddress;
    private static int TMPort;
    private static String TPLM_IP;
    private static int TPLM_PORT;

    private static Map<String, List<String>> clientsAndServers = new HashMap<>();
    private static Map<String, Set<String>> clientsAndResources = new ConcurrentHashMap<>();
    private static final AtomicLong transactionCounter = new AtomicLong();

    public static void main(String[] args) throws Exception {
        getAddress(args);
        startTM();
    }

    private static void getAddress(String[] args) throws Exception {
        if (args.length == 4) {
            TMIpAddress = args[0];
            TMPort = Integer.parseInt(args[1]);
            TPLM_IP = args[2];
            TPLM_PORT = Integer.parseInt(args[3]);
        } else {
            throw new Exception("Number of parameter not valid, please pass <TM_IP> <TM_PORT> [<TPLM_IP> <TPLM_PORT>]");
        }
    }

    private static void startTM() {
        try {
            io.grpc.Server managerServer = NettyServerBuilder
                    .forAddress(new InetSocketAddress(TMIpAddress, TMPort))
                    //.forPort(TMPort)
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
            if (transactionCounter.get() >= MAX_VALUE) {
                transactionCounter.set(0);
            }
            String generatedUUID = UUID.randomUUID().toString() + transactionCounter.incrementAndGet();
            clientsAndServers.putIfAbsent(generatedUUID, new ArrayList<>());
            clientsAndResources.putIfAbsent(generatedUUID, new HashSet<>());

            GetTransactionIDResponse response = GetTransactionIDResponse.newBuilder().setTransactionID(generatedUUID).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("Generated ID was: " + generatedUUID);
        }

        @Override
        public void endTransaction(EndTransactionRequest request, StreamObserver<EndTransactionResponse> responseObserver) {
            String clientID = request.getClientID();
            List<String> serversForClientID = clientsAndServers.getOrDefault(clientID, Collections.emptyList());
            List<String> serversCopy = new ArrayList<>(serversForClientID);

            List<Boolean> prepare = new ArrayList<>();
            for (String server : serversCopy) {
                try{
                    String[] parts = server.split(":");
                    ManagedChannel channel = createChannel(parts[0], Integer.parseInt(parts[1]));
                    var stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                    var response = stub.prepare(Tmservectorcontract.PrepareRequest.newBuilder().build());
                    prepare.add(response.getReady());
                    channel.shutdown();
                }
                catch (StatusRuntimeException sre){
                    prepare.add(false);
                    sre.printStackTrace();
                }

            }

            if(prepare.isEmpty()){
                // enviar mensagem de transactionCommited = false
                EndTransactionResponse res = EndTransactionResponse.newBuilder()
                        .setTransactionCommited(false)
                        .setMessage("The transaction was aborted.")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
                return;
            }

            boolean abort = prepare.contains(false);

            for (String server : serversCopy) {
                String[] parts = server.split(":");
                ManagedChannel channel = createChannel(parts[0], Integer.parseInt(parts[1]));

                try{
                    var stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                    if (abort) {
                        stub.abort(Tmservectorcontract.AbortRequest.newBuilder().build());
                    } else {
                        stub.commit(Tmservectorcontract.CommitRequest.newBuilder().build());
                    }
                }
                catch (StatusRuntimeException sre){
                    sre.printStackTrace();
                }

                channel.shutdown();
            }

            Set<String> resources = clientsAndResources.getOrDefault(clientID, Collections.emptySet());
            for (String res : resources) {
                ManagedChannel tplmChannel = createChannel(TPLM_IP, TPLM_PORT);
                var tplmStub = TPLMServiceGrpc.newBlockingStub(tplmChannel);

                try {
                    tplmStub.unlock(TPLMProto.UnlockRequest.newBuilder()
                            .setTransactionID(clientID)
                            .setResourceID(res)
                            .build());
                } catch (Exception e) {
                    System.err.println("[TM] Unlock error for " + res + ": " + e.getMessage());
                } finally {
                    tplmChannel.shutdown();
                }
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

            if (clientsAndResources.getOrDefault(clientID, Collections.emptySet()).contains(resourceID)) {
                System.out.println("TM: Resource " + resourceID + " already registered, skipping lock.");
            } else {
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

            clientsAndServers.computeIfAbsent(clientID, k -> new ArrayList<>());
            if (!clientsAndServers.get(clientID).contains(server)) {
                clientsAndServers.get(clientID).add(server);
            }

            clientsAndResources.computeIfAbsent(clientID, k -> new HashSet<>());
            clientsAndResources.get(clientID).add(resourceID);

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
