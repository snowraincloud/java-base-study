package creational.factory.abstract_factory;

import edu.wbu.pattern.creational.factory.common.AsusComputer;
import edu.wbu.pattern.creational.factory.common.IComputer;

/**
 * <h1>华硕工厂</h1>
 *
 * @author wangjunhao
 **/
public class AsusFactory implements Factory{

    @Override
    public IServer createServe() {
        AsusServer server = new AsusServer();
        server.setCpu("E5-2300");
        server.setHardDisk(1000);
        server.setRam(8);
        server.setMainBoard("asus-board");
        return server;
    }

    @Override
    public IComputer createComputer() {
        AsusComputer computer = new AsusComputer();
        computer.setCpu("i5-8300");
        computer.setDisplay("asus-display");
        computer.setHardDisk(1000);
        computer.setRam(8);
        computer.setMainBoard("asus-server-board");
        return computer;
    }
}
