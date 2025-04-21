package tplm;

import io.grpc.stub.StreamObserver;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import tplm.TPLMProto.*;

import java.util.Map;
import java.util.concurrent.*;

public class TPLMServiceImpl extends TPLMServiceGrpc.TPLMServiceImplBase {

    private final CuratorFramework zkClient;
    private final Map<String, InterProcessMutex> lockMap = new ConcurrentHashMap<>();

    public TPLMServiceImpl(String zkHost) {
        zkClient = CuratorFrameworkFactory.newClient(zkHost, new ExponentialBackoffRetry(1000, 3));
        zkClient.start();
        System.out.println("[TPLM] Connected to ZooKeeper at " + zkHost);
    }

    private String buildPath(String resourceID) {
        return "/locks/" + resourceID.replace(":", "_");
    }

    @Override
    public void lock(LockRequest request, StreamObserver<LockResponse> responseObserver) {
        String txID = request.getTransactionID();
        String resource = request.getResourceID();
        String path = buildPath(resource);

        InterProcessMutex mutex = new InterProcessMutex(zkClient, path);
        try {
            if (mutex.acquire(5, TimeUnit.SECONDS)) {
                lockMap.put(txID + ":" + resource, mutex);
                System.out.printf("[TPLM] LOCK ACQUIRED - TX: %s, RESOURCE: %s%n", txID, resource);
                responseObserver.onNext(LockResponse.newBuilder().setSuccess(true).build());
            } else {
                System.out.printf("[TPLM] LOCK TIMEOUT - TX: %s, RESOURCE: %s%n", txID, resource);
                responseObserver.onNext(LockResponse.newBuilder().setSuccess(false).build());
            }
        } catch (Exception e) {
            System.out.printf("[TPLM] LOCK ERROR - TX: %s, RESOURCE: %s, ERROR: %s%n", txID, resource, e.getMessage());
            responseObserver.onNext(LockResponse.newBuilder().setSuccess(false).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void unlock(UnlockRequest request, StreamObserver<UnlockResponse> responseObserver) {
        String txID = request.getTransactionID();
        String resource = request.getResourceID();
        String key = txID + ":" + resource;
        InterProcessMutex lock = lockMap.get(key);

        try {
            if (lock != null && lock.isAcquiredInThisProcess()) {
                lock.release();
                lockMap.remove(key);
                System.out.printf("[TPLM] UNLOCKED - TX: %s, RESOURCE: %s%n", txID, resource);
            } else {
                System.out.printf("[TPLM] UNLOCK SKIPPED - TX: %s, RESOURCE: %s (Not held)%n", txID, resource);
            }
            responseObserver.onNext(UnlockResponse.newBuilder().setSuccess(true).build());
        } catch (Exception e) {
            System.out.printf("[TPLM] UNLOCK ERROR - TX: %s, RESOURCE: %s, ERROR: %s%n", txID, resource, e.getMessage());
            responseObserver.onNext(UnlockResponse.newBuilder().setSuccess(false).build());
        }
        responseObserver.onCompleted();
    }
}
