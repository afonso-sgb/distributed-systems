package isos.iesd.servector;

import jakarta.xml.ws.Endpoint;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
public class SiteServer {

    static final String HOSTNAME = "localhost"; // Or 0.0.0.0 to be published 
    // in all network interfaces of some host
    static final String PORT = "2060";

    public static void main(String[] args) {

        // Publish to ISystem0 the ISyVector/CesVector/SerVector registry meta-data
        //  Endpoint ep = Endpoint.create(new Vector());
        
        Endpoint ep = Endpoint.create(new Vector());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/Vector");
    }
}
