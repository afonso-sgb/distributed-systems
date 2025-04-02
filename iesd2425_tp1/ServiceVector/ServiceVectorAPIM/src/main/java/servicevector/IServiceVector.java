package servicevector;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

import java.util.List;

@WebService(name = "IServiceVector", targetNamespace = "http://servicevectorserver")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceVector {

    @WebMethod
    int checkServiceVector(int b);

    @WebMethod
    String receiveMessage(String message);

    @WebMethod
    int read(int pos);

    @WebMethod
    void write(int pos, int n);

    List<Integer> returnCurrentVector();

}
