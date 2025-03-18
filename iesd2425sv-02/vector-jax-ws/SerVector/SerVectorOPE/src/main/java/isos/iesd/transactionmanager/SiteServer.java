package isos.iesd.transactionmanager;

import jakarta.xml.ws.Endpoint;

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
