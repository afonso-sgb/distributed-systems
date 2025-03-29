package servicevector;

import jakarta.xml.ws.Endpoint;

public class ServiceVectorSiteServer {
    static final String HOSTNAME = "localhost";
    static final String PORT = "2061";

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new ServiceVector());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/ServiceVector");
        System.out.println("http://" + HOSTNAME + ":" + PORT + "/ServiceVector");
    }
}
