package tm;

import clienttm.ClientTMContractGrpc.*;
import clienttm.ClientTMContractGrpc;
import clienttm.Clienttmcontract.*;
import io.grpc.stub.StreamObserver;
import java.util.UUID;

public class TMClient extends ClientTMContractGrpc.ClientTMContractImplBase{

    @Override
    public void getTransactionID(GetTransactionIDRequest request, StreamObserver<GetTransactionIDResponse> responseObserver) {
        String generatedUUID = UUID.randomUUID().toString();
        GetTransactionIDResponse response = GetTransactionIDResponse.newBuilder()
                .setTransactionID(generatedUUID)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void endTransaction(EndTransactionRequest request, StreamObserver<EndTransactionResponse> responseObserver) {
        // Fazer o 2PC e enviar resposta ao cliente
    }
}
