package isos.iesd.servectorcli;


/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
public class VectorClient {

    public static void main(String[] args) throws InterruptedException {

        // Register with ISystem0
        System.out.println("VectorClient()... validate access to SerVector...");
        new VectorClient().invokeTransactionManagerService();
    }

    public int invokeTransactionManagerService() {

        int idx = 3;
        int indice1 = 2;
        int indice2 = 3;

        TransactionManagerService transactionManager = new TransactionManagerService();
        TransactionManager port = transactionManager.getTransactionManagerPort();
        port.canExecuteTransaction(idx, indice1, indice2);

        /*int v, res = 0;
        int x = 50;

        try {
            VectorService service = new VectorService();
            IVector port = service.getVectorPort();

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

         */

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
