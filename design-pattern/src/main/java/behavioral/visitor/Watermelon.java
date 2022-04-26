package behavioral.visitor;

/**
 * <h1>西瓜</h1>
 *
 * @author wangjunhao
 **/
public class Watermelon extends Food {
    @Override
    public String name() {
        return "watermelon";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.chooseFood(this);
    }
}
