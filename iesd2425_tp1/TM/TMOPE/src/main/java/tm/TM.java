package tm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tm.IServiceVector;
import tm.ServiceVectorService;

import jakarta.jws.WebService;

import javax.sound.sampled.Port;

@WebService(endpointInterface = "tm.ITM")
public class TM implements ITM{

    private static String IP_ADDRESS = "localhost";
    private static String PORT = "2061";
    // static final String IP_ADDRESS_2 = "127.0.0.1";
    // static final String PORT_2 = "2062";

    // [10.10.10.10,8080] [11.11.11.11,7070] [12.12.12.12,6060]
    private static List<String> allServiceVectors = new ArrayList<>();

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";
    private static boolean allReady = true;

    private static ServiceVectorService serviceVector = new ServiceVectorService();
    private static IServiceVector port = serviceVector.getServiceVectorPort();

/*    private static void addIPToList(){
        String first_ip = IP_ADDRESS + "," + PORT;
        String second_ip = IP_ADDRESS_2 + "," + PORT_2;
        allServiceVectors.add(first_ip);
        allServiceVectors.add(second_ip);
    }*/

    private static void okCheck(String message){
        if(message.equals(OK)){
            allReady = true;
        }
        else{
            allReady = false;
        }
    }

    @Override
    public int check(int a) {
        ServiceVectorService serviceVector = new ServiceVectorService();
        IServiceVector port = serviceVector.getServiceVectorPort();
        int x = port.checkServiceVector(a);
        return x + 5;
    }

    /*
        FLUXO:
            for serviceVector in allServicevectors{
                read v from p1
                calculate new value (res = v - x)
                write res in p1
                read v from p2
                calculate new value (res = v + x)
                write v in p2
            }
     */
    @Override
    public boolean sendTransaction(int p1, int p2, int x) {
        allServiceVectors.add("localhost:2061");
        System.out.println("Vector before transaction: " + port.returnCurrentVector());
        int v = 0, res = 0;
        for(int i = 0; i < allServiceVectors.size(); i++){
            v = port.read(p1);
            res = v - x;
            port.write(p1, res);

            v = port.read(p2);
            res = v + x;
            port.write(p2, res);
        }
        System.out.println("Vector after transaction: " + port.returnCurrentVector());
        return true;
    }
}
