package isos.tutorial.isyvector.cesvector.servector;

import jakarta.xml.ws.Endpoint;

/**
 * IESD - Distributed Coordination - Vector service example
 **/
public class SiteServer {
	static final String HOSTNAME = "localhost";
	static final String PORT = "2060";

    public static void main(String[] args) {
    	
    	// Publish on ISystem0 the ISyVector/CesVector/SerVector access resources
 /*
		Isystem0RsCliProxy isystem0RsCliProxy = new Isystem0RsCliProxy();
		System.out.printf( "isystem0RsCliProxy.ping() -> %s\n", isystem0RsCliProxy.ping() );
 */
        Endpoint ep = Endpoint.create(new Vector());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/Vector");
    }

}
