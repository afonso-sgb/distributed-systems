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

    private static List<String> allServiceVectors = new ArrayList<>();

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";
    private static final String NotOK = "NotOK";
    private static boolean allReady = true;

    private static ServiceVectorService serviceVector = new ServiceVectorService();
    private static IServiceVector port = serviceVector.getServiceVectorPort();


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

        for(int i = 0; i < allServiceVectors.size(); i++){
            String receivedMessage = port.receiveMessage(PREPARE);
            if(receivedMessage.equals(NotOK)) allReady = false;
        }

        if(allReady){
            port.receiveMessage(COMMIT);
        }
        else{
            port.receiveMessage(ABORT);
            return false;
        }

        System.out.println("Vector after transaction: " + port.returnCurrentVector());
        return true;
    }

    public static void main(String[] args) {
        // Pedir todos os IPs e portos ao manager e adicionar todos os IPs e portos à lista allServiceVectors
        ManagerService managerService = new ManagerService();
        IManager port = managerService.getManagerPort();
        allServiceVectors = port.sendIpsAndPortsToTM();
        System.out.println("allServiceVectors: " + allServiceVectors);

    }
}
