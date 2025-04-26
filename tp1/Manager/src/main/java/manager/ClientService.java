package manager;

import clientmanager.*;
import clientmanager.Clientmanagarcontract.*;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class ClientService extends ClientManagerContractGrpc.ClientManagerContractImplBase {

    List<Server> serviceVectors;
    public  ClientService(List<Server> serviceVectors){
        this.serviceVectors = serviceVectors;
    }
    @Override
    public void getAllServers(GetAllServersRequest servectorRequest, StreamObserver<GetAllServersResponse> responseObserver) {

        System.out.println("Sending to client, all active service vectors!");

        GetAllServersResponse.Builder responseBuilder = GetAllServersResponse.newBuilder();

        for (Server server : this.serviceVectors) {
            String address = server.getIp()+":"+server.getPort();
            responseBuilder.addSerVectorAtual(address);
        }

        GetAllServersResponse response = responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println("Service vectors sent successfully!");

    }
}
