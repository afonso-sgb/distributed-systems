package client;

import tm.ITM;
import tm.TMService;

public class Client {



    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Usage: java -jar <jar-file> <p1> <p2> <x>");
            System.out.println("p1: primeira posicao para ler e escrever");
            System.out.println("p2: segunda posicao para ler e escrever");
            System.out.println("x: valor para calcular o novo inteiro no vetor");
            return;
        }

        int p1 = Integer.parseInt(args[0]);
        int p2 = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);

        TMService tmService = new TMService();
        ITM port = tmService.getTMPort();
        boolean response = port.sendTransaction(p1, p2, x);
        System.out.println("Transaction sent.");
        System.out.println("Response from TM: " + response);
    }
}
