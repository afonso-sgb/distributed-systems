package servicevector2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(name = "IServiceVector2", targetNamespace = "http://servicevector2server")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceVector2 {

    @WebMethod
    int checkServiceVector2(int b);

    @WebMethod
    String receiveMessage(String message);

}
