package servicevector;

import jakarta.jws.WebService;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "servicevector.IServiceVector")
public class ServiceVector implements IServiceVector{

    private static List<Integer> vector = Arrays.asList(300, 234, 56, 789);

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";

    @Override
    public int checkServiceVector(int b) {
        return b + 10;
    }

    public String processPrepare(){
        return OK;
    }

    public String receiveMessage(String message){
        if(message.equals(PREPARE)) {
            return processPrepare();
        }

        if(message.equals(COMMIT)) System.out.println("Recebi um commit!");
        if(message.equals(ABORT)) System.out.println("Recebi um abort!");

        return "";
    }

    @Override
    public int read(int pos) {
        System.out.println("Reading from vector position " + pos);
        return vector.get(pos);
    }

    @Override
    public void write(int pos, int n) {
        System.out.println("Writing to vector in position " + pos + " with " + n);
        vector.set(pos, n);
    }

    @Override
    public List<Integer> returnCurrentVector() {
        return vector;
    }

}
