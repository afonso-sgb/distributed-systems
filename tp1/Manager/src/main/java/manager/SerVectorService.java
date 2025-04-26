package manager;

import io.grpc.stub.StreamObserver;
import managerservectorstubs.*;

import java.util.List;

public class SerVectorService extends ManagerSerVectorServiceGrpc.ManagerSerVectorServiceImplBase {

    List<Server> serviceVectors;
    public SerVectorService(List<Server> serviceVectors){
        this.serviceVectors = serviceVectors;
    }

    @Override
    public void registerSerVector(SerVectorAddress servectorRequest, StreamObserver<VoidResponse> responseObserver) {

        String ip = servectorRequest.getIp();
        int port = servectorRequest.getPort();
        System.out.println("Registering with IP: " + ip + " and port: " + port);

        VoidResponse response = VoidResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

        this.serviceVectors.add(new Server(ip, port));
        System.out.println("Current vectors: " + serviceVectors);
    }


}
