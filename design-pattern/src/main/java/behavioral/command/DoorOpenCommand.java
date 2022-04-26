package behavioral.command;

/**
 * <h1>开门命令</h1>
 *
 * @author wangjunhao
 **/
public class DoorOpenCommand implements ICommand {
    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        System.out.print("执行DoorOpenCommand: ");
        door.openDoor();
    }

    @Override
    public void undo() {
        System.out.print("撤销DoorOpenCommand: ");
        door.closeDoor();
    }
}
