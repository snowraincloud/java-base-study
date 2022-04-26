package creational.factory.factory_method;

import edu.wbu.pattern.creational.factory.common.AsusComputer;
import edu.wbu.pattern.creational.factory.common.IComputer;

/**
 * <h1>华硕电脑工厂</h1>
 *
 * @author wangjunhao
 **/
public class AsusComputerFactory implements IComputerFactory{

    @Override
    public IComputer createComputer() {
        AsusComputer computer = new AsusComputer();
        computer.setCpu("i5-8300");
        computer.setDisplay("asus-display");
        computer.setHardDisk(1000);
        computer.setRam(8);
        computer.setMainBoard("asus-board");
        return computer;
    }
}
