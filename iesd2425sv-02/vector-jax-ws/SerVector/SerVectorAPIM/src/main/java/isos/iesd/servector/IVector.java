package isos.iesd.servector;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(name = "IVector", targetNamespace = "http://isos.iesd.servectorserver")
@SOAPBinding(style = Style.DOCUMENT)
public interface IVector {

    @WebMethod
    int read(int pos);

    @WebMethod
    void write(int pos, int n);

    @WebMethod
    String invariantCheck();

}
