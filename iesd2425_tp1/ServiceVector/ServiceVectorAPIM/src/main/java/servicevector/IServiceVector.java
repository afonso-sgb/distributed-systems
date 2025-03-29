package servicevector;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(name = "IServiceVector", targetNamespace = "http://servicevectorserver")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceVector {

    @WebMethod
    int checkServiceVector(int b);

}
