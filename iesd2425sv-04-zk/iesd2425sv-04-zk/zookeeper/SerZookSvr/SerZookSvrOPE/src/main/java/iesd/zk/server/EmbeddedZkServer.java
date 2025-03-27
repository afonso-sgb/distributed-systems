package iesd.zk.server;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.zookeeper.server.NIOServerCnxnFactory;
import org.apache.zookeeper.server.ServerCnxnFactory;
import org.apache.zookeeper.server.ZooKeeperServer;

public class EmbeddedZkServer {

    public static void main(String[] args) {
        int clientPort = 2181;
        int numConnections = 5000;
        int tickTime = 2000;
        String dataDirectory = "/tmp/zookeeper"; // System.getProperty("java.io.tmpdir");
        System.out.println("dataDirectory = " + dataDirectory);
        //System.setProperty("zookeeper.admin.enableServer", "false");

        File dir = new File(dataDirectory, "zookeeper").getAbsoluteFile();

        ZooKeeperServer server;
        try {
            server = new ZooKeeperServer(dir, dir, tickTime);

            ServerCnxnFactory factory;

            factory = new NIOServerCnxnFactory();
            factory.configure(new InetSocketAddress(clientPort), numConnections);

            factory.startup(server);
        } catch (IOException | InterruptedException e) {
        }

        // ...shutdown some time later
        // factory.shutdown();
    }

}
