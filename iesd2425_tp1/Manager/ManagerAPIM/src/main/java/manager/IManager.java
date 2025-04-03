package manager;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.List;

@WebService(name = "IManager", targetNamespace = "http://managerserver")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface IManager {

    @WebMethod
    int receiveIpAndPortFromVector(String ip, int port);

    @WebMethod
    List<String> sendIpsAndPortsToTM();
}
