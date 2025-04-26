package client;

import clientmanager.ClientManagerContractGrpc;
import clientmanager.ClientManagerContractGrpc.*;
import clientmanager.Clientmanagarcontract.*;

import clientservector.ClientServectorContractGrpc;
import clientservector.ClientServectorContractOuterClass;
import clienttm.ClientTMContractGrpc;
import clienttm.ClientTMContractGrpc.*;
import clienttm.Clienttmcontract.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static String managerIP;
    private static int managerPort;
    private static String TMIP;
    private static int TMPort;

    private static String MyID;

    private static List<String> allServers = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length != 4) {
            System.err.println("ERROR: Invalid arguments. Expected usage: <managerIP> <managerPort> <TMIP> <TMPort>");
            System.exit(1);
        }

        managerIP = args[0];
        managerPort = Integer.parseInt(args[1]);
        TMIP = args[2];
        TMPort = Integer.parseInt(args[3]);

        getAllSevers();
        System.out.println("Servers: " + allServers);


        if(allServers.isEmpty()){
            System.out.println("There are no SerVectors available. Ending task.");
            return ;
        }

        MyID = getTransactionID();

        System.out.println("My ID is: " + MyID);

        // Enviar reads e writes aos servidores

        for(String server : allServers){
            int pos1 = 0, pos2 = 2;

            String serverIP = server.split(":")[0];
            int serverPort = Integer.parseInt(server.split(":")[1]);

            // Tira da posição 1 e põe na posição 2
            int valueRead = sendRead(serverIP, serverPort, pos1);
            int newValue = valueRead - 100;
            boolean writeSuccess = sendWrite(serverIP, serverPort, pos1, newValue);
            if(!writeSuccess) sendWrite(serverIP, serverPort, pos1, newValue);

            valueRead = sendRead(serverIP, serverPort, pos2);
            newValue = valueRead + 100;
            writeSuccess = sendWrite(serverIP, serverPort, pos2, newValue);
            if(!writeSuccess) sendWrite(serverIP, serverPort, pos2, newValue);


        }


        System.out.println("Transactions commited: " + terminateTransaction() + " for client: " + MyID);

    }

    private static boolean sendWrite(String servectorIP, int servectorPort, int pos, int value){
        ManagedChannel channel = createChannel(servectorIP, servectorPort);
        ClientServectorContractGrpc.ClientServectorContractBlockingStub stub = ClientServectorContractGrpc.newBlockingStub(channel);

        ClientServectorContractOuterClass.WriteRequest request = ClientServectorContractOuterClass.WriteRequest.newBuilder()
                .setClientID(MyID)
                .setPosition(pos)
                .setValue(value)
                .build();

        ClientServectorContractOuterClass.WriteResponse response = stub.write(request);
        channel.shutdown();

        return response.getSuccess();
    }

    private static int sendRead(String servectorIP, int servectorPort, int pos){
        ManagedChannel channel = createChannel(servectorIP, servectorPort);
        ClientServectorContractGrpc.ClientServectorContractBlockingStub stub = ClientServectorContractGrpc.newBlockingStub(channel);

        ClientServectorContractOuterClass.ReadRequest request = ClientServectorContractOuterClass.ReadRequest.newBuilder()
                .setClientID(MyID)
                .setPosition(pos)
                .build();

        ClientServectorContractOuterClass.ReadResponse response = stub.read(request);
        channel.shutdown();
        return response.getValue();
    }

    private static ManagedChannel createChannel(String ip, int port) {
        return ManagedChannelBuilder
                .forAddress(ip, port)
                .usePlaintext()
                .build();
    }

    private static void getAllSevers() {
        ManagedChannel channel = createChannel(managerIP, managerPort);

        ClientManagerContractBlockingStub stub = ClientManagerContractGrpc.newBlockingStub(channel);

        GetAllServersRequest request = GetAllServersRequest.newBuilder().build();

        try {
            GetAllServersResponse response = stub.getAllServers(request);
            allServers.addAll(response.getSerVectorAtualList());
        } catch (StatusRuntimeException sre) {
            System.out.println("RPC failed: " + sre.getMessage());
            sre.printStackTrace();
        } finally {
            channel.shutdown();
        }
    }

    private static boolean terminateTransaction() {
        boolean bool_return = false;

        ManagedChannel channel = createChannel(TMIP, TMPort);

        ClientTMContractBlockingStub stub = ClientTMContractGrpc.newBlockingStub(channel);

        EndTransactionRequest request = EndTransactionRequest.newBuilder()
                .setClientID(MyID)
                .build();

        try {
            EndTransactionResponse response = stub.endTransaction(request);
            System.out.println(response.getMessage());
            bool_return = response.getTransactionCommited();
            System.out.println(response.getMessage());
        }
        catch (StatusRuntimeException sre) {
            System.out.println("RPC failed: " + sre.getMessage());
            sre.printStackTrace();
        }
        finally {
            channel.shutdown();
        }

        return bool_return;
    }

    private static String getTransactionID(){
        ManagedChannel channel = createChannel(TMIP, TMPort);
        String id = "-1";

        ClientTMContractBlockingStub stub = ClientTMContractGrpc.newBlockingStub(channel);

        GetTransactionIDRequest request = GetTransactionIDRequest.newBuilder().build();

        try{
            GetTransactionIDResponse response = stub.getTransactionID(request);
            id = response.getTransactionID();
        }
        catch (StatusRuntimeException sre) {
            System.out.println("RPC failed: " + sre.getMessage());
            sre.printStackTrace();
        }
        finally {
            channel.shutdownNow();
        }
        return id;
    }
}
