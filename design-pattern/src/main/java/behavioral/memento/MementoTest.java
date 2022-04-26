package behavioral.memento;

/**
 * <h1>备忘录模式</h1>
 * <p>在不暴露对象实现细节的情况下保存和恢复对象之前的状态。</p>
 * <p>中介者模式包含以下主要角色。</p>
 * <ol>
 * <li>
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。</li>
 * <li>
 * 具体中介者（Concrete Mediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。</li>
 * <li>
 * 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。</li>
 * <li>
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。</li>
 * </ol>
 * @author wangjunhao
 **/
public class MementoTest {
    public static void main(String[] args) {
        Player player = new Player();
        // 存档
        Player.Memento memento = player.saveState();

        // 打 Boss，打不过，壮烈牺牲
        player.fightBoss();

        // 读档
        player.restoreState(memento);
    }
}
