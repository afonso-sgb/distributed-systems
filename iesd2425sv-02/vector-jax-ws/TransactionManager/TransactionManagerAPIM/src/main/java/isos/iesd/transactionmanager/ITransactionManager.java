package isos.iesd.transactionmanager;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(name = "ITransactionManager", targetNamespace = "http://isos.iesd.transactionmanagerserver")
@SOAPBinding(style = Style.DOCUMENT)
public interface ITransactionManager {

    @WebMethod
    boolean canExecuteTransaction(int idx, int indice1, int indice2);

}
