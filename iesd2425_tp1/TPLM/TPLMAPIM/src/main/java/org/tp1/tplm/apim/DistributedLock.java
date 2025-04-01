package org.tp1.tplm.apim;

import org.apache.zookeeper.*;
import org.apache.zookeeper.ZooDefs.Ids;
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
            lockPath = zk.create(lockBasePath + "/" + lockName, null, Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);

            // Criamos um znode dentro do diretório lockBasePath com o lockName
            // O modo EPHEMERAL_SEQUENTIAL adiciona um sufixo numérico ao nome do lock para garantir a ordem

            List<String> nodes = zk.getChildren(lockBasePath, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    synchronized (DistributedLock.this) {
                        DistributedLock.this.notifyAll();
                    }
                }
            });

            Collections.sort(nodes);
            //aqui é criada uma lista com os nos filhos, ou seja os nos que aguardam o lock e ordena os locks da forma correta

            if (lockPath.endsWith(nodes.get(0))) {
                return;
            } else {
                synchronized (this) {
                    this.wait();
                }
            }
        } catch (KeeperException e) {
            throw new IOException(e);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }
    }

    public void unlock() throws IOException {
        try {
            zk.delete(lockPath, -1);
            lockPath = null;

        } catch(KeeperException | InterruptedException e){
            throw new IOException(e);
        }
    }
    // responsavel por libertar o lock



}
