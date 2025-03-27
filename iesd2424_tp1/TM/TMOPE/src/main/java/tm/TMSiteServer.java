package tm;

import jakarta.xml.ws.Endpoint;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class TMSiteServer {
    static final String HOSTNAME = "localhost";
    static final String PORT = "2060";

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new TM());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/TM");
        System.out.println("http://" + HOSTNAME + ":" + PORT + "/TM");
    }
}
