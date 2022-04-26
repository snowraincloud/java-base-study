package behavioral.command;

import java.util.Arrays;

/**
 * <h1>命令模式</h1>
 * <p>将请求转换为一个包含与请求相关的所有信息的独立对象。 该转换让你能根据不同的请求将方法参数化、
 * 延迟请求执行或将其放入队列中， 且能实现可撤销操作。</p>
 * <p>命令模式包含以下主要角色。</p>
 * <ol>
 * <li>
 * 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。</li>
 * <li>
 * 具体命令类（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。</li>
 * <li>
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。</li>
 * <li>
 * 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。</li>
 * </ol>
 * @author wangjunhao
 **/
public class CommandTest {
    public static void main(String[] args) {
        Door door = new Door();
        for (ICommand command: Arrays.asList(new DoorCloseCommand(door), new DoorOpenCommand(door))){
            handleCommand(command);
        }
    }

    private static void handleCommand(ICommand command){
        command.execute();
        command.undo();
    }
}
