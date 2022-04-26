package behavioral.visitor;

/**
 * <h1>吃 接口</h1>
 * @author wangjunhao
 **/
public interface IVisitor {

    void chooseFood(Watermelon watermelon);

    void chooseFood(Banana banana);
}