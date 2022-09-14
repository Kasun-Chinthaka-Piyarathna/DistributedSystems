package org.kasun.synchronization;

public interface DistributedTxListener {
    void onGlobalCommit();

    void onGlobalAbort();
}
