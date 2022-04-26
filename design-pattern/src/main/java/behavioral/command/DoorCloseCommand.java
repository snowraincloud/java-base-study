package behavioral.command;

/**
 * <h1>关门命令</h1>
 *
 * @author wangjunhao
 **/
public class DoorCloseCommand implements ICommand {
    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        System.out.print("执行DoorCloseCommand: ");
        door.closeDoor();
    }

    @Override
    public void undo() {
        System.out.print("撤销DoorCloseCommand: ");
        door.openDoor();
    }
}
