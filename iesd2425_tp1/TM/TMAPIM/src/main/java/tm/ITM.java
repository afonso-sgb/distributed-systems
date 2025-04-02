package tm;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(name = "ITM", targetNamespace = "http://tmserver")
@SOAPBinding(style = Style.DOCUMENT)
public interface ITM {

    @WebMethod
    int check(int a);

    @WebMethod
    boolean sendTransaction(int p1, int p2, int x);

}
