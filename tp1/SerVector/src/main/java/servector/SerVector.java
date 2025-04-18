package servector;

import io.grpc.ServerBuilder;
import managerservectorstubs.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.Arrays;

import clientservector.ClientServectorContractGrpc;
import clientservector.ClientServectorContractOuterClass;
import io.grpc.stub.StreamObserver;
import tmservector.TMSerVectorContractGrpc;
import tmservector.Tmservectorcontract;

public class SerVector extends ManagerSerVectorServiceGrpc.ManagerSerVectorServiceImplBase {
    private static ArrayList<Integer> vector = new ArrayList<>(Arrays.asList(300, 234, 56, 789));

    private static ArrayList<Integer> tmp_vector = new ArrayList<>(vector);

    private final int ARRAY_SUM = vector.stream().mapToInt(Integer::intValue).sum();

    private static String serviceVectorIpAddress;
    private static int serviceAddressPort;

    private static String managerIP;
    private static int managerPort;

    private static String TMIP;
    private static int TMPort;

    public static void main(String[] args) throws Exception {
        getAddress(args);
        registSerVector();
        startServiceVector();
    }

    private static void registSerVector() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(managerIP, managerPort)
                .usePlaintext()
                .build();
        ManagerSerVectorServiceGrpc.ManagerSerVectorServiceBlockingStub stub = ManagerSerVectorServiceGrpc.newBlockingStub(channel);

        SerVectorAddress address = SerVectorAddress.newBuilder()
                .setIp(serviceVectorIpAddress)
                .setPort(serviceAddressPort)
                .build();

        VoidResponse response = stub.registerSerVector(address);
        System.out.println("Service registered.");

        channel.shutdown();
    }

    private static void startServiceVector(){
        try {
            io.grpc.Server SerVectorServer = ServerBuilder
                    .forPort(serviceAddressPort)
                    .addService(new ClientService())
                    .addService(new TMService())
                    .build();

            SerVectorServer.start();
            System.out.println("SerVector up!\nListening on Port: " + serviceAddressPort);

            SerVectorServer.awaitTermination();


        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    private static void getAddress(String[] args) throws Exception{
        if(args.length != 6){
            System.out.println("Usage: <ServiceVectorIP> <ServiceVectorPort> <managerIP> <managerPort> <TMIP> <TMPort>\"");
            System.exit(1);
        }

        serviceVectorIpAddress = args[0];
        try {
            serviceAddressPort = Integer.parseInt(args[1]);
            managerIP = args[2];
            managerPort = Integer.parseInt(args[3]);
            TMIP = args[4];
            TMPort = Integer.parseInt(args[5]);
        } catch (NumberFormatException e) {
            throw new Exception("Error: Port has to be a valid number!");
        }

    }

    private boolean invariantCheckIsOk(){
        return ARRAY_SUM == vector.stream().mapToInt(Integer::intValue).sum();
    }

    private static ManagedChannel createChannel(String ip, int port) {
        return ManagedChannelBuilder
                .forAddress(ip, port)
                .usePlaintext()
                .build();
    }

    private static void alertTM(String clientID, String servectorIP, int servectorPort){
        ManagedChannel channel = createChannel(TMIP, TMPort);

        TMSerVectorContractGrpc.TMSerVectorContractBlockingStub stub = TMSerVectorContractGrpc.newBlockingStub(channel);

        Tmservectorcontract.AddServerRequest request = Tmservectorcontract.AddServerRequest.newBuilder()
                .setClientID(clientID)
                .setServectorIP(servectorIP)
                .setServectorPort(servectorPort)
                .build();

        Tmservectorcontract.AddServerResponse response = stub.addServerToCommit(request);

        channel.shutdown();
        if(response.getSuccess()) System.out.println("Server added to TM.");

    }

    public static class ClientService extends ClientServectorContractGrpc.ClientServectorContractImplBase {
        @Override
        public void write(ClientServectorContractOuterClass.WriteRequest request, StreamObserver<ClientServectorContractOuterClass.WriteResponse> responseObserver) {
            String clientID = request.getClientID();
            int pos = request.getPosition();
            int value = request.getValue();

            try{
                System.out.println("Current vector before write: " + tmp_vector.toString());
                tmp_vector.set(pos, value);
                // ENVIAR TRUE AO CLIENTE
                ClientServectorContractOuterClass.WriteResponse response = ClientServectorContractOuterClass.WriteResponse.newBuilder()
                        .setSuccess(true)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
            catch(Exception e){
                // ENVIAR FALSE AO CLIENTE
                ClientServectorContractOuterClass.WriteResponse response = ClientServectorContractOuterClass.WriteResponse.newBuilder()
                        .setSuccess(false)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }

            alertTM(clientID, serviceVectorIpAddress, serviceAddressPort);

            System.out.println("Current vector after write: " + tmp_vector.toString());
        }

        @Override
        public void read(ClientServectorContractOuterClass.ReadRequest request, StreamObserver<ClientServectorContractOuterClass.ReadResponse> responseObserver) {
            String clientID = request.getClientID();

            int pos = request.getPosition();
            int value = tmp_vector.get(pos);

            alertTM(clientID, serviceVectorIpAddress, serviceAddressPort);

            ClientServectorContractOuterClass.ReadResponse response = ClientServectorContractOuterClass.ReadResponse.newBuilder()
                    .setValue(value)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static class TMService extends TMSerVectorContractGrpc.TMSerVectorContractImplBase{
        @Override
        public void prepare(Tmservectorcontract.PrepareRequest request, StreamObserver<Tmservectorcontract.PrepareResponse> responseObserver) {
            Tmservectorcontract.PrepareResponse res = Tmservectorcontract.PrepareResponse.newBuilder()
                    .setReady(true)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }

        @Override
        public void commit(Tmservectorcontract.CommitRequest request, StreamObserver<Tmservectorcontract.CommitResponse> responseObserver) {
            System.out.println("Vector before commit: " + vector);
            vector = new ArrayList<>(tmp_vector);
            System.out.println("Vector after commit: " + vector);
            Tmservectorcontract.CommitResponse res = Tmservectorcontract.CommitResponse.newBuilder()
                    .setSuccess(true)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }

        @Override
        public void abort(Tmservectorcontract.AbortRequest request, StreamObserver<Tmservectorcontract.AbortResponse> responseObserver) {
            System.out.println("Vector before abort: " + vector);
            tmp_vector = new ArrayList<>(vector);
            System.out.println("Vector after abort: " + vector);
            Tmservectorcontract.AbortResponse res = Tmservectorcontract.AbortResponse.newBuilder()
                    .setAborted(true)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }
    }
}
