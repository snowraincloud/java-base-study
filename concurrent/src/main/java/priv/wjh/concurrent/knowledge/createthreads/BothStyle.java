package priv.wjh.concurrent.knowledge.createthreads;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class BothStyle {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Runnable");
        }){
            @Override
            public void run(){
                System.out.println("thread");
            }
        }.start();

    }
}
