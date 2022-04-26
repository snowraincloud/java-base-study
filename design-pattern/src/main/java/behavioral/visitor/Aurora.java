package behavioral.visitor;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class Aurora implements IVisitor{

    @Override
    public void chooseFood(Watermelon watermelon) {
        System.out.println("Aurora gets a " + watermelon.name());
    }

    @Override
    public void chooseFood(Banana banana) {
        System.out.println("Aurora doesn't like " + banana.name());
    }
}
