package tplm;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

import java.net.InetSocketAddress;

public class TPLMServer {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            // System.out.println("Usage: <ZK_HOST> <PORT>");
            System.out.println("Usage: <zkIP> <zkPort-2181> <TPLMport>");
            return;
        }

        String zkIP = args[0];
        int zkPort = Integer.parseInt(args[1]);
        String zkHost = zkIP + ":" + zkPort;

        int TPLMport = Integer.parseInt(args[2]);

        Server server = NettyServerBuilder
                .forAddress(new InetSocketAddress(zkIP, TPLMport))
                //.forPort(port)
                .addService(new TPLMServiceImpl(zkHost))
                .build();

        server.start();
        System.out.println("TPLM is running on port " + TPLMport);
        server.awaitTermination();
    }
}
