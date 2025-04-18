package tm;

import clienttm.ClientTMContractGrpc;
import clienttm.Clienttmcontract.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import tmservector.TMSerVectorContractGrpc;
import tmservector.Tmservectorcontract;

import java.util.*;
import java.util.UUID;

class TM {
    private static String TMIpAddress;
    private static int TMPort;
    private static Map<String, List<String>> clientsAndServers = new HashMap<>();

    public static void main(String[] args) throws Exception {
        getAddress(args);
        startTM();
    }

    private static void getAddress(String[] args) throws Exception{
        if (args.length == 2) {
            TMIpAddress = args[0];
            try {
                TMPort = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new Exception("Error: Port has to be a valid number!");
            }
        }else {
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
        return ManagedChannelBuilder
                .forAddress(ip, port)
                .usePlaintext()
                .build();
    }

    public static class TMClient extends ClientTMContractGrpc.ClientTMContractImplBase{

        @Override
        public void getTransactionID(GetTransactionIDRequest request, StreamObserver<GetTransactionIDResponse> responseObserver) {
            String generatedUUID = UUID.randomUUID().toString();
            clientsAndServers.putIfAbsent(generatedUUID, new ArrayList<>());

            GetTransactionIDResponse response = GetTransactionIDResponse.newBuilder()
                    .setTransactionID(generatedUUID)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("Generated ID was: " + generatedUUID);
        }

        @Override
        public void endTransaction(EndTransactionRequest request, StreamObserver<EndTransactionResponse> responseObserver) {
            // Fazer o 2PC e enviar resposta ao cliente
            List<String> serversForClientID = clientsAndServers.get(request.getClientID());

            ArrayList<Boolean> prepare = new ArrayList<>();
            for(String server : serversForClientID){
                String IP = server.split(":")[0];
                int port = Integer.parseInt(server.split(":")[1]);

                ManagedChannel channel = createChannel(IP, port);
                TMSerVectorContractGrpc.TMSerVectorContractBlockingStub stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                Tmservectorcontract.PrepareRequest req = Tmservectorcontract.PrepareRequest.newBuilder().build();

                Tmservectorcontract.PrepareResponse response = stub.prepare(req);
                prepare.add(response.getReady());

                channel.shutdown();
            }

            boolean abort = prepare.contains(false);

            if(abort){
                for(String server : serversForClientID){
                    String IP = server.split(":")[0];
                    int port = Integer.parseInt(server.split(":")[1]);

                    ManagedChannel channel = createChannel(IP, port);
                    TMSerVectorContractGrpc.TMSerVectorContractBlockingStub stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                    Tmservectorcontract.AbortRequest req = Tmservectorcontract.AbortRequest.newBuilder().build();

                    Tmservectorcontract.AbortResponse response = stub.abort(req);

                    System.out.println("SerVector: " + IP + " aborted: " + response.getAborted());
                    channel.shutdown();
                }
                EndTransactionResponse res = EndTransactionResponse.newBuilder()
                        .setTransactionCommited(false)
                        .setMessage("The transaction was aborted.")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
            }

            else {
                for(String server : serversForClientID){
                    String IP = server.split(":")[0];
                    int port = Integer.parseInt(server.split(":")[1]);

                    ManagedChannel channel = createChannel(IP, port);
                    TMSerVectorContractGrpc.TMSerVectorContractBlockingStub stub = TMSerVectorContractGrpc.newBlockingStub(channel);
                    Tmservectorcontract.CommitRequest req = Tmservectorcontract.CommitRequest.newBuilder().build();

                    Tmservectorcontract.CommitResponse response = stub.commit(req);

                    System.out.println("SerVector: " + IP + " commited: " + response.getSuccess());
                    channel.shutdown();
                }
                EndTransactionResponse res = EndTransactionResponse.newBuilder()
                        .setTransactionCommited(true)
                        .setMessage("The transaction was commited.")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
            }

        }
    }

    public static class TMSerVector extends TMSerVectorContractGrpc.TMSerVectorContractImplBase{
        @Override
        public void addServerToCommit(Tmservectorcontract.AddServerRequest request, StreamObserver<Tmservectorcontract.AddServerResponse> responseObserver) {
            String clientID = request.getClientID();
            String server = request.getServectorIP() + ":" + request.getServectorPort();

            List<String> servers = clientsAndServers.get(clientID);
            if(!servers.contains(server)){
                servers.add(server);
            }

            try{
                clientsAndServers.put(clientID, servers);
                Tmservectorcontract.AddServerResponse response = Tmservectorcontract.AddServerResponse.newBuilder()
                        .setSuccess(true)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            catch(Exception e){
                e.printStackTrace();
                Tmservectorcontract.AddServerResponse response = Tmservectorcontract.AddServerResponse.newBuilder()
                        .setSuccess(false)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }

            System.out.println("Current clientsAndServers: " + clientsAndServers);

        }
    }

}
