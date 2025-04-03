package tm;

import jakarta.xml.ws.Endpoint;

public class TMSiteServer {
    static final String HOSTNAME = "localhost";
    static final String PORT = "2060";

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new TM());
        TM.main(args);
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/TM");
        System.out.println("http://" + HOSTNAME + ":" + PORT + "/TM");
    }
}
