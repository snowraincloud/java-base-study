package behavioral.chain_of_responsibility;

/**
 * <h1>程序员抽象类</h1>
 * @author wangjunhao
 **/
public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next) {
        this.next = next;
    }

    abstract void handle(Bug bug);
}