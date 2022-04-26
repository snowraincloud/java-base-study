package behavioral.visitor;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class Kevin implements IVisitor{
    @Override
    public void chooseFood(Watermelon watermelon) {
        System.out.println("Kevin doesn't like " + watermelon.name());
    }
    @Override
    public void chooseFood(Banana banana) {
        System.out.println("Kevin gets a " + banana.name());
    }
}
