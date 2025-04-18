package manager;

import io.grpc.ServerBuilder;

import java.util.ArrayList;
import java.util.List;


public class Manager {
    private static String managerIpAddress;
    private static int managerPort;
    private static List<Server> serviceVectors = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        getAddress(args);
        startManager();
    }

    private static void getAddress(String[] args) throws Exception{
        if (args.length == 2) {
            managerIpAddress = args[0];
            try {
                managerPort = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new Exception("Error: Port has to be a valid number!");
            }
        }else {
            throw new Exception("Number of parameter not valid, please pass IP and Port!");
        }
    }

    private static void startManager() {
        try {
            io.grpc.Server managerServer = ServerBuilder
                    .forPort(managerPort)
                    .addService(new SerVectorService(serviceVectors))
                    .addService(new ClientService(serviceVectors))
                    .build();

            managerServer.start();
            System.out.println("Manager up!\nAddress: "+ managerIpAddress + "\nListening on Port: " + managerPort);

            managerServer.awaitTermination();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
