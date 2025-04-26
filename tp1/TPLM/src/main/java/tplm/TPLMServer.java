package tplm;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

import java.net.InetSocketAddress;

public class TPLMServer {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: <ZK_HOST> <PORT>");
            return;
        }

        String zkHost = args[0];
        int port = Integer.parseInt(args[1]);

        Server server = NettyServerBuilder
                .forAddress(new InetSocketAddress(zkHost, port))
                .addService(new TPLMServiceImpl(zkHost))
                .build();

        server.start();
        System.out.println("TPLM is running on port " + port);
        server.awaitTermination();
    }
}
