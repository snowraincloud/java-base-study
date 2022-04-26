package creational.factory.factory_method;

import edu.wbu.pattern.creational.factory.common.IComputer;
import edu.wbu.pattern.creational.factory.common.LenovoComputer;

/**
 * <h1>联想电脑工厂</h1>
 *
 * @author wangjunhao
 **/
public class LenovoComputerFactory implements IComputerFactory {
    @Override
    public IComputer createComputer() {
        LenovoComputer computer = new LenovoComputer();
        computer.setCpu("i5-8300");
        computer.setDisplay("lenovo-display");
        computer.setHardDisk(1000);
        computer.setRam(8);
        computer.setMainBoard("lenovo-board");
        return computer;
    }
}
