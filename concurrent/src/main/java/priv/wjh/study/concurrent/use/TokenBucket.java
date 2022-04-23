package priv.wjh.study.concurrent.use;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class TokenBucket {
    private final Sync sync = new Sync();

    private static class Sync extends AbstractQueuedSynchronizer {
        public Sync() {
        }

        @Override
        protected int tryAcquireShared(int arg) {
            if (getState() >= arg){
                return compareAndSetState(getState(), getState() - arg)? 1 : -1;
            }
            return -1;
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            return compareAndSetState(getState(), getState() + arg);
        }

        public int getCount(){
            return getState();
        }
    }

    public void putToken(int tokenCount){
        int i = 0;
        while (!sync.releaseShared(tokenCount)){}
        System.out.println("Current token count: " + sync.getCount());
    }

    public void useToken(int tokenCount) throws InterruptedException {
        sync.acquireSharedInterruptibly(tokenCount);
    }

    public int getTokenCount(){
        return sync.getCount();
    }
}
