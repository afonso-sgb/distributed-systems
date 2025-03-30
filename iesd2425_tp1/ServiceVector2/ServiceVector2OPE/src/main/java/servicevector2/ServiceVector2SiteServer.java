package servicevector2;

import jakarta.xml.ws.Endpoint;

public class ServiceVector2SiteServer {
    static final String HOSTNAME = "127.0.0.1";
    static final String PORT = "2062";

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new ServiceVector2());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/ServiceVector2");
        System.out.println("http://" + HOSTNAME + ":" + PORT + "/ServiceVector2");
    }
}

