package priv.wjh.concurrent.knowledge.deadlock;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class MustDeadLock {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            synchronized (lock1){
                System.out.println("Get the lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("Get the lock2");
                }
            }
        });
        var t2 = new Thread(() -> {
            synchronized (lock2){
                System.out.println("Get the lock2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("Get the lock1");
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All child thread execution finished");

    }
}

// jstack pid
//    Found one Java-level deadlock:
//        =============================
//        "Thread-0":
//        waiting to lock monitor 0x000001fb37809500 (object 0x0000000711c430f0, a java.lang.Object),
//        which is held by "Thread-1"
//        "Thread-1":
//        waiting to lock monitor 0x000001fb37a32400 (object 0x0000000711c430e0, a java.lang.Object),
//        which is held by "Thread-0"
//
//        Java stack information for the threads listed above:
//        ===================================================
//        "Thread-0":
//        at priv.wjh.concurrent.knowledge.deadlock.MustDeadLock.lambda$main$0(MustDeadLock.java:21)
//        - waiting to lock <0x0000000711c430f0> (a java.lang.Object)
//        - locked <0x0000000711c430e0> (a java.lang.Object)
//        at priv.wjh.concurrent.knowledge.deadlock.MustDeadLock$$Lambda$1/0x0000000800060840.run(Unknown Source)
//        at java.lang.Thread.run(java.base@11.0.8/Thread.java:834)
//        "Thread-1":
//        at priv.wjh.concurrent.knowledge.deadlock.MustDeadLock.lambda$main$1(MustDeadLock.java:33)
//        - waiting to lock <0x0000000711c430e0> (a java.lang.Object)
//        - locked <0x0000000711c430f0> (a java.lang.Object)
//        at priv.wjh.concurrent.knowledge.deadlock.MustDeadLock$$Lambda$2/0x0000000800061040.run(Unknown Source)
//        at java.lang.Thread.run(java.base@11.0.8/Thread.java:834)
//
//        Found 1 deadlock.