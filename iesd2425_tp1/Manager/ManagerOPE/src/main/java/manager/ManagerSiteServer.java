package manager;

import jakarta.xml.ws.Endpoint;

public class ManagerSiteServer {

    static final String HOSTNAME = "localhost";
    static final String PORT = "2020";

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new Manager());
        System.out.println("Starting SiteServer...");
        ep.publish("http://" + HOSTNAME + ":" + PORT + "/Manager");
        System.out.println("http://" + HOSTNAME + ":" + PORT + "/Manager");
    }
}
