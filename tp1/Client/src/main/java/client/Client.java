package client;

import clientmanager.ClientManagerContractGrpc;
import clientmanager.ClientManagerContractGrpc.*;
import clientmanager.Clientmanagarcontract.*;

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

    private static List<String> allServers = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: <managerIP> <managerPort> <TMIP> <TMPort>");
            System.exit(1);
        }

        String transactionID = "-1";

        managerIP = args[0];
        managerPort = Integer.parseInt(args[1]);
        TMIP = args[2];
        TMPort = Integer.parseInt(args[3]);

        getAllSevers();
        System.out.println("Servers: " + allServers);

        /*while (transactionID.equals("-1")){
            transactionID = getTransactionID();
        }
        System.out.println("My transaction ID is: " + transactionID);

        // Enviar reads e writes aos servidores
        // POR FAZER

        System.out.println("Transactions commited: " + terminateTransaction());*/

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

        EndTransactionRequest request = EndTransactionRequest.newBuilder().build();

        try {
            EndTransactionResponse response = stub.endTransaction(request);
            System.out.println(response.getMessage());
            bool_return = response.getTransactionCommited();
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
            channel.shutdown();
        }
        return id;
    }
}
