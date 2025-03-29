package servicevector;

import jakarta.jws.WebService;

@WebService(endpointInterface = "servicevector.IServiceVector")
public class ServiceVector implements IServiceVector{

    @Override
    public int checkServiceVector(int b) {
        return b + 10;
    }
}
