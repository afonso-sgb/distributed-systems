package isos.iesd.transactionmanager;

import java.util.Arrays;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * IESD - Distributed Coordination - Vector service example
 *
 */
@WebService(endpointInterface = "isos.iesd.servector.ITransactionManager")
public class TransactionManager implements ITransactionManager {

    private static List<Integer> vector = Arrays.asList(300, 234, 56, 789);


    @Override
    public boolean canExecuteTransaction(int idx, int indice1, int indice2){
        // TODO: IMPLEMENTAR
        return false;
    }
}

