package client;

public class ClientTestMain {
    public static void main(String[] args) throws InterruptedException {
        // Args para o Client: <managerIP> <managerPort> <TMIP> <TMPort>
        String[] clientArgs = {"localhost", "5000", "localhost", "5001"};

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
