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
    static final String IP_ADDRESS_2 = "127.0.0.1";
    static final String PORT_2 = "2062";

    // [10.10.10.10,8080] [11.11.11.11,7070] [12.12.12.12,6060]
    private static List<String> allServiceVectors = new ArrayList<>();

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";
    private static boolean allReady = true;

    private static void addIPToList(){
        String first_ip = IP_ADDRESS + "," + PORT;
        String second_ip = IP_ADDRESS_2 + "," + PORT_2;
        allServiceVectors.add(first_ip);
        allServiceVectors.add(second_ip);
    }

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

    public static void main(String[] args) {
        ServiceVectorService serviceVector = new ServiceVectorService();
        IServiceVector port = serviceVector.getServiceVectorPort();

        ServiceVector2Service serviceVector2 = new ServiceVector2Service();
        IServiceVector2 port2 = serviceVector2.getServiceVector2Port();

        addIPToList();

/*        String ip1 = allServiceVectors.get(0).split(",")[0];
        String porto1 = allServiceVectors.get(0).split(",")[1];

        String ip2 = allServiceVectors.get(1).split(",")[0];
        String porto2 = allServiceVectors.get(1).split(",")[1];*/

        String messageReceived = port.receiveMessage(PREPARE);
        okCheck(messageReceived);

        messageReceived = port2.receiveMessage(PREPARE);
        okCheck(messageReceived);

        if(allReady){
            port.receiveMessage(COMMIT);
            port2.receiveMessage(COMMIT);
        }
    }
}
