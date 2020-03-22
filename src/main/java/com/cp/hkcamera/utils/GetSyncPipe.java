package com.cp.hkcamera.utils;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 12:40
 */
public class GetSyncPipe {
    public SyncPipe syncPipe = null;

    public SyncPipe getSyncPipe() {
        return syncPipe;
    }

    public void setSyncPipe(SyncPipe syncPipe) {
        this.syncPipe = syncPipe;
    }

    public void setSyncPipeNull() {
        this.syncPipe = null;
    }
}
