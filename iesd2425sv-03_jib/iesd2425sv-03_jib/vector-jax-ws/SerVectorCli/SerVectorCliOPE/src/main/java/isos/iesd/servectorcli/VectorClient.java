package isos.iesd.servectorcli;

import isos.iesd.servector.IVector;
import isos.iesd.servector.VectorService;
import jakarta.xml.ws.WebServiceRef;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
public class VectorClient {

//    @WebServiceRef(wsdlLocation = "http://host.containers.internal:2060/Vector?wsdl")
//    static VectorService service;

    public static void main(String[] args) throws InterruptedException {

        // Register with ISystem0
        System.out.println("VectorClient()... validate access to SerVector...");
        new VectorClient().invokeVerctorServices();
    }

    public int invokeVerctorServices() {

        int v, res = 0;
        int x = 50;

        try {
            // Service service = VectorService.create("http://localhost:2060", serviceName);
            // IVector port = service.getPort(IVector.class);

            VectorService service = new VectorService();
            IVector port = service.getVectorPort();

            System.out.println("ServVector endpoint: " + service.getWSDLDocumentLocation());

            v = port.read(0);

            System.out.println("Leu Vector[0] = " + v);
            res = v - x;
            Thread.sleep(1);
            port.write(0, res);
            System.out.println("Escreveu Vector[0] = " + res);
            Thread.sleep(10);
            v = port.read(2);
            System.out.println("Leu Vector[2] = " + v);
            res = v + x;
            Thread.sleep(10);
            port.write(2, res);
            System.out.println("Escreveu Vector[2] = " + res);
        } catch (InterruptedException ex) {
            Logger.getLogger(VectorClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public String invariantVerctorServices() {

        String invariant = null;
        VectorService service = new VectorService();
        IVector port = service.getVectorPort();
        invariant = port.invariantCheck();
        System.out.println("Invariant = " + invariant);
        return invariant;
    }
}
