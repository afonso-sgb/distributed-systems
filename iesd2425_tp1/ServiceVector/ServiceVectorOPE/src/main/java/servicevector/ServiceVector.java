package servicevector;

import jakarta.jws.WebService;
import tm.IManager;
import tm.ManagerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "servicevector.IServiceVector")
public class ServiceVector implements IServiceVector{

    private static final String IP = "localhost";
    private static final int PORT = 2061;

    private static List<Integer> vector = Arrays.asList(300, 234, 56, 789);

    private static List<Integer> tmp_vector = new ArrayList<>(vector);

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";
    private static final String NotOK = "NotOK";

    @Override
    public int checkServiceVector(int b) {
        return b + 10;
    }

    private String processPrepare(){
        System.out.println("Recebi um prepare.");
        return OK;
    }

    private String processCommit(){
        System.out.println("Recebi um commit.");
        vector = new ArrayList<>(tmp_vector);
        System.out.println("I made the transaction!");
        return OK;
    }

    private String processAbort(){
        System.out.println("Recebi um abort!");
        tmp_vector = new ArrayList<>(vector);
        System.out.println("I aborted the transaction.");
        return OK;
    }

    public String receiveMessage(String message){
        if(message.equals(PREPARE)) {
            return processPrepare();
        }

        if(message.equals(COMMIT)) {
            return processCommit();
        }

        if(message.equals(ABORT)){
            return processAbort();
        }

        return "";
    }

    @Override
    public int read(int pos) {
        System.out.println("Reading from vector position " + pos);
        return tmp_vector.get(pos);
    }

    @Override
    public void write(int pos, int n) {
        System.out.println("Writing to vector in position " + pos + " with " + n);
        tmp_vector.set(pos, n);
    }

    @Override
    public List<Integer> returnCurrentVector() {
        return vector;
    }

    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();
        IManager port = managerService.getManagerPort();
        int status = port.receiveIpAndPortFromVector(IP, PORT);
        System.out.println("Status returned from manager: " + status);
    }
}
