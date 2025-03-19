package isos.iesd.transactionmanager;

import java.util.Arrays;
import java.util.List;

import isos.iesd.transactionmanager.ITransactionManager;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
@WebService(
        name = "TransactionManager",
        targetNamespace = "http://isos.iesd.transactionmanager",
        endpointInterface = "isos.iesd.transactionmanager.ITransactionManager"
)

@SOAPBinding(style = Style.DOCUMENT)
public class TransactionManager implements ITransactionManager {

    private static List<Integer> vector = Arrays.asList(300, 234, 56, 789);


    @Override
    public boolean canExecuteTransaction(int idx, int indice1, int indice2){
        System.out.println("Entrei com valores: idx=" + idx + " indice1=" + indice1 + "e indice2=" + indice2);
        return false;
    }
}

