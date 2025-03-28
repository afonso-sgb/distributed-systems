package client;

import tm.ITM;
import tm.TMService;

public class Client {
    public static void main(String[] args) {
        TMService tmService = new TMService();
        ITM port = tmService.getTMPort();
        System.out.println(port.check(30));
    }
}
