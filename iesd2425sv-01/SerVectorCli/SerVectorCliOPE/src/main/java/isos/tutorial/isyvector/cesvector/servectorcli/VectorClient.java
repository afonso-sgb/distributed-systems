package isos.tutorial.isyvector.cesvector.servectorcli;

import isos.tutorial.isyvector.cesvector.servector.IVector;
import isos.tutorial.isyvector.cesvector.servector.VectorService;

/**
 * IESD - Distributed Coordination - Vector service example
 **/
public class VectorClient {

    public static void main(String[] args) throws InterruptedException {

        VectorService service = new VectorService();
        IVector port = service.getVectorPort();

        int v, res;
        int x = 50;

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

    }
}
