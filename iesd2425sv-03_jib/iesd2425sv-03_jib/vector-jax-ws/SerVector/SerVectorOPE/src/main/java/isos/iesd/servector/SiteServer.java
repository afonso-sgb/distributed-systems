package isos.iesd.servector;

import jakarta.xml.ws.Endpoint;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
public class SiteServer {

    // With HOSTNAME= "0.0.0.0", the implemented API interface is published in
    // all network interfaces
    // If adopted a specific IP, check if container IP mappings work properly
    // If you try HOSTNAME= "localhost", a connection refuse to hostPort occurs...
    static final String HOSTNAME = "0.0.0.0"; 
    static final String PORT = "2060";

    public static void main(String[] args) {

        // Publish to ISystem0 the ISyVector/CesVector/SerVector registry meta-data
        //  Endpoint ep = Endpoint.create(new Vector());
        
        Endpoint ep = Endpoint.create(new Vector());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/Vector");
    }
}
