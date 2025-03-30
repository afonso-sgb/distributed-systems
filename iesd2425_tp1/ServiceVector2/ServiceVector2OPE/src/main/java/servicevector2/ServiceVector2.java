package servicevector2;

import jakarta.jws.WebService;

@WebService(endpointInterface = "servicevector2.IServiceVector2")
public class ServiceVector2 implements IServiceVector2{

    private static final String PREPARE = "PREPARE";
    private static final String COMMIT = "COMMIT";
    private static final String ABORT = "ABORT";
    private static final String OK = "OK";

    @Override
    public int checkServiceVector2(int b) {
        return b + 20;
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
