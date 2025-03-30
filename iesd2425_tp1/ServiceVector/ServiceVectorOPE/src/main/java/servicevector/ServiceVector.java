package servicevector;

import jakarta.jws.WebService;

@WebService(endpointInterface = "servicevector.IServiceVector")
public class ServiceVector implements IServiceVector{

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
}
