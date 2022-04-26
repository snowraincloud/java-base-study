package behavioral.command;

/**
 * <h1>命令接口</h1>
 * @author wangjunhao
 **/
public interface ICommand {
    /**
     * <h2>执行操作</h2>
     */
    void execute();

    /**
     * <h2>撤销操作</h2>
     */
    void undo();
}
