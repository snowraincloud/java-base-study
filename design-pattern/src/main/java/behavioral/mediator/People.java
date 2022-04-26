package behavioral.mediator;

/**
 * <h1>群员</h1>
 * @author wangjunhao
 **/
public class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public void receive(String msg){
        System.out.println(name + " receive a message: " + msg);
    }

    public void send(String msg, Group group){
        System.out.println(name + " send a message: " + msg);
        group.notify(msg);
    }
}
