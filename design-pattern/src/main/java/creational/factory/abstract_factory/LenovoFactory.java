package creational.factory.abstract_factory;

import edu.wbu.pattern.creational.factory.common.IComputer;
import edu.wbu.pattern.creational.factory.common.LenovoComputer;

/**
 * <h1>联想工厂</h1>
 *
 * @author wangjunhao
 **/
public class LenovoFactory implements Factory{
    @Override
    public IServer createServe() {
        LenovoServer server = new LenovoServer();
        server.setCpu("E5-2300");
        server.setHardDisk(1000);
        server.setRam(8);
        server.setMainBoard("asus-board");
        return server;
    }

    @Override
    public IComputer createComputer() {
        LenovoComputer computer = new LenovoComputer();
        computer.setCpu("i5-8300");
        computer.setDisplay("asus-display");
        computer.setHardDisk(1000);
        computer.setRam(8);
        computer.setMainBoard("asus-server-board");
        return computer;
    }
}
