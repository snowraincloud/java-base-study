package priv.wjh.concurrent.knowledge.threadobjectclasscommonmethods;

/**
 * <h1>展示wait notify的基本用法</h1>
 * <p>研究线程执行顺序</p>
 * <p>证明wait释放锁</p>
 * @author wangjunhao
 **/
public class Wait {
    public static Object object= new Object();

    static class Thread1 extends Thread{
        @Override
        public void run() {
           synchronized (object){
               System.out.println(getName() + "-start");
               try {
                   object.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(getName() + "-restart");
           }
           // 错误测试
//            test();
        }

        private synchronized void test(){
            System.out.println(getName() + "-start");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "-restart");
        }
    }



    static class Thread2 extends Thread{
        @Override
        public void run() {
           synchronized (object){
               object.notify();
               System.out.println(t1.getName() + " : " + t1.getState());
               System.out.println(getName() + "-run complete");
           }
        }
    }

    public static Thread1 t1 = new Thread1();
    public static Thread2 t2 = new Thread2();
    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getName() + ":" + t1.getState());
        t2.start();
    }
}
