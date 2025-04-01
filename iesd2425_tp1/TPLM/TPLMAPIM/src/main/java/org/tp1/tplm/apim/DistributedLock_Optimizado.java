package org.tp1.tplm.apim;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class DistributedLock {
    private final ZooKeeper zk;
    private final String lockBasePath;
    private final String lockName;
    private String lockPath;

    public DistributedLock(ZooKeeper zk, String lockBasePath, String lockName) {
        this.zk = zk;
        this.lockBasePath = lockBasePath;
        this.lockName = lockName;
    }

    public void lock() throws IOException {
        try {
            // Cria um znode efêmero sequencial
            lockPath = zk.create(lockBasePath + "/" + lockName, null, ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.EPHEMERAL_SEQUENTIAL);

            final Object lockMonitor = new Object();
            synchronized (lockMonitor) {
                while (true) {
                    List<String> nodes = zk.getChildren(lockBasePath, event -> {
                        synchronized (lockMonitor) {
                            lockMonitor.notifyAll();
                        }
                    });

                    Collections.sort(nodes);
                    if (lockPath.endsWith(nodes.get(0))) {
                        return; // Lock adquirido
                    } else {
                        lockMonitor.wait(); // Espera até ser notificado
                    }
                }
            }
        } catch (KeeperException | InterruptedException e) {
            throw new IOException(e);
        }
    }

    public void unlock() throws IOException {
        try {
            zk.delete(lockPath, -1);
            lockPath = null;
        } catch (KeeperException | InterruptedException e) {
            throw new IOException(e);
        }
    }
}