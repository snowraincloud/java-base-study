package behavioral.state;

/**
 * <h1>状态模式</h1>
 * <p>在一个对象的内部状态变化时改变其行为， 使其看上去就像改变了自身所属的类一样。</p>
 * <p>状态模式包含以下主要角色。</p>
 * <ol>
 * <li>
 * 环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。</li>
 * <li>
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。</li>
 * <li>
 * 具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。</li>
 * </ol>
 * @author wangjunhao
 **/
public class StateTest {
    public static void main(String[] args) {
        AbstractUser user = new User();
        System.out.println("--- ordinary user ---");
        user.playVideo();
        user.playVipVideo();
        user.vipExpired();
        user.buyVip();
        System.out.println("--- vip user ---");
        user.playVideo();
        user.playVipVideo();
        user.vipExpired();
        user.buyVip();
    }
}
