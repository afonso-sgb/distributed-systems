package tm;

import java.util.Arrays;
import java.util.List;

import tm.IServiceVector;
import tm.ServiceVectorService;

import jakarta.jws.WebService;

@WebService(endpointInterface = "tm.ITM")
public class TM implements ITM{

    @Override
    public int check(int a) {
        ServiceVectorService serviceVector = new ServiceVectorService();
        IServiceVector port = serviceVector.getServiceVectorPort();
        int x = port.checkServiceVector(a);
        return x + 5;
    }
}
