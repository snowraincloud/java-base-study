package priv.wjh.concurrent.tools.aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * <h1>An example of AQS</h1>
 * @author wangjunhao
 **/
public class OneShotLatch {

    private final Sync sync = new Sync();

    public void signal(){
        sync.releaseShared(0);
    }

    public void await(){
        sync.acquireShared(0);
    }


    private static final class Sync extends AbstractQueuedSynchronizer {

        @Override
        protected int tryAcquireShared(int arg) {
            return getState() == 1 ? 1 : -1;
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            setState(1);
            return true;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        OneShotLatch oneShotLatch = new OneShotLatch();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println("Waiting for latch " + Thread.currentThread().getName());
                oneShotLatch.await();
                System.out.println("Got the latch " + Thread.currentThread().getName());
            }, "thread-" + i).start();
        }
        Thread.sleep(5000);
        oneShotLatch.signal();
        System.out.println("Released the latch");
    }
}
