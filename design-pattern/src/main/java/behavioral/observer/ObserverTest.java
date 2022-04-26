package behavioral.observer;

/**
 * <h1>观察者模式</h1>
 * <p>定义一种订阅机制， 可在对象事件发生时通知多个 “观察” 该对象的其他对象。</p>
 * <p>观察者模式的主要角色如下。</p>
 * <ol>
 * <li>
 * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。</li>
 * <li>
 * 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。</li>
 * <li>
 * 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。</li>
 * <li>
 * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。</li>
 * </ol>
 * @author wangjunhao
 **/
public class ObserverTest {
    public static void main(String[] args) {
        User up1 = new User("up1");

        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.follow(up1);
        user2.follow(up1);

        up1.sendTrends("up1-trends");
        up1.sendVideo("up1-video");
    }
}
