package tplm;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class TPLMServer {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: <ZK_HOST> <PORT>");
            return;
        }

        String zkHost = args[0];
        int port = Integer.parseInt(args[1]);

        Server server = ServerBuilder
                .forPort(port)
                .addService(new TPLMServiceImpl(zkHost))
                .build();

        server.start();
        System.out.println("TPLM is running on port " + port);
        server.awaitTermination();
    }
}
