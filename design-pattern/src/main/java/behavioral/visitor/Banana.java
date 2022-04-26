package behavioral.visitor;

/**
 * <h1>香蕉</h1>
 * @author wangjunhao
 **/
public class Banana extends Food {
    @Override
    public String name() {
        return "banana";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFood(this);
    }
}
