package behavioral.visitor;

/**
 * <h1>食物抽象类</h1>
 *
 * @author wangjunhao
 **/
public abstract class Food {
    public abstract String name();

    /**
     * <h2>Food 中添加 accept 方法，接收访问者</h2>
     * @param visitor 访问者
     */
    public abstract void accept(IVisitor visitor);
}