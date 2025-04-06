package servector;

import managerservectorstubs.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Arrays;
public class SerVector extends ManagerSerVectorServiceGrpc.ManagerSerVectorServiceImplBase {
    private int [] vector = {300, 234, 56, 789};

    private int ARRAY_SUM = Arrays.stream(vector)
                                  .sum();
    private static String serviceVectorIpAddress;
    private static int serviceAddressPort;

    private static String managerIP;
    private static int managerPort;

    public static void main(String[] args) throws Exception {
        getAddress(args);
        registSerVector();
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
        System.out.println("Service registered: " + response);

        channel.shutdown();
    }

    private static void getAddress(String[] args) throws Exception{
        if(args.length != 4){
            System.out.println("Usage: <ServiceVectorIP> <ServiceVectorPort> <managerIP> <managerPort>\"");
            System.exit(1);
        }

        serviceVectorIpAddress = args[0];
        try {
            serviceAddressPort = Integer.parseInt(args[1]);
            managerIP = args[2];
            managerPort = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            throw new Exception("Error: Port has to be a valid number!");
        }

    }


    private boolean invariantCheckIsOk(){
        return ARRAY_SUM == Arrays.stream(vector)
                                  .sum();
    }

    //TODO contract serVector and client for sum and subtraction
}
