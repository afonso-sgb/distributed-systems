package isos.iesd.servectorcli;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

@WebService(name = "ITransactionManager", targetNamespace = "http://isos.iesd.transactionmanager")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface ITransactionManager {

    /**
     *
     * @param idx
     * @param indice1
     * @param indice2
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "canExecuteTransaction", targetNamespace = "http://isos.iesd.transactionmanager", className = "isos.iesd.transactionmanager.CanExecuteTransaction")
    @ResponseWrapper(localName = "canExecuteTransactionResponse", targetNamespace = "http://isos.iesd.transactionmanager", className = "isos.iesd.transactionmanager.CanExecuteTransactionResponse")
    @Action(input = "http://isos.iesd.transactionmanager/canExecuteTransaction", output = "http://isos.iesd.transactionmanager/ITransactionManager/canExecuteTransactionResponse")
    public boolean canExecuteTransaction(
            @WebParam(name = "idx", targetNamespace = "")
            int idx,

            @WebParam(name = "indice1", targetNamespace = "")
            int indice1,

            @WebParam(name = "indice2", targetNamespace = "")
            int indice2);
}
