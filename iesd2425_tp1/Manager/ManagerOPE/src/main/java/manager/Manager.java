package manager;

import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "manager.IManager")
public class Manager implements IManager{

    List<String> allServices = new ArrayList<>();

    @Override
    public int receiveIpAndPortFromVector(String ip, int port) {
        String endpoint = ip + ":" + port;
        allServices.add(endpoint);
        return 0;
    }

    @Override
    public List<String> sendIpsAndPortsToTM() {
        return allServices;
    }
}
