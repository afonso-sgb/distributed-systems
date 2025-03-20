package isos.iesd.transactionmanager;

import jakarta.xml.ws.Endpoint;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
public class SiteServer {

    static final String HOSTNAME = "localhost"; // Or 0.0.0.0 to be published 
    // in all network interfaces of some host
    static final String PORT = "2061"   ;

    public static void main(String[] args) {

        // Publish to ISystem0 the ISyVector/CesVector/SerVector registry meta-data
        //  Endpoint ep = Endpoint.create(new Vector());
        String URL = "http://" + HOSTNAME + ":" + PORT + "/TransactionManager";

        System.out.println("Starting SiteServer...");
        Endpoint.publish(URL, new TransactionManager());
        System.out.println("Server is published at: " + URL);
    }
}
