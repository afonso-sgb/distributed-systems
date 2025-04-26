package client;

public class ClientTestMain {

    private static String managerIP;
    private static String managerPort;
    private static String TMIP;
    private static String TMPort;

    public static void main(String[] args) throws InterruptedException {
        // Args para o Client: <managerIP> <managerPort> <TMIP> <TMPort>
        if (args.length != 4) {
            System.err.println("ERROR: Invalid arguments. Expected usage: <managerIP> <managerPort> <TMIP> <TMPort>");
            System.exit(1);
        }
        managerIP = args[0];
        managerPort = args[1];
        TMIP = args[2];
        TMPort = args[3];
        String[] clientArgs = {managerIP, managerPort, TMIP, TMPort};

        Thread client1 = new Thread(() -> {
            try {
                Client.main(clientArgs);
            } catch (Exception e) {
                System.err.println("[Client1] Erro: " + e.getMessage());
                e.printStackTrace();
            }
        });

        Thread client2 = new Thread(() -> {
            try {
                Client.main(clientArgs);
            } catch (Exception e) {
                System.err.println("[Client2] Erro: " + e.getMessage());
                e.printStackTrace();
            }
        });

        client1.start();
        client2.start();

        client1.join();
        client2.join();

        System.out.println("Teste de concorrência de clientes terminado.");
    }
}
