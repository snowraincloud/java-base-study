package creational.factory.simple_factory;

import edu.wbu.pattern.creational.factory.common.AsusComputer;
import edu.wbu.pattern.creational.factory.common.ComputerBrand;
import edu.wbu.pattern.creational.factory.common.IComputer;
import edu.wbu.pattern.creational.factory.common.LenovoComputer;

/**
 * <h1>计算机工厂</h1>
 *
 * @author wangjunhao
 **/
public class ComputerFactory {
    /**
     * <h2>生成电脑</h2>
     * @param brand 电脑品牌
     * @return 电脑
     */
    static IComputer createComputer(ComputerBrand brand){
        switch (brand){
            case LENOVO:{
                LenovoComputer computer = new LenovoComputer();
                computer.setCpu("i5-8300");
                computer.setDisplay("lenovo-display");
                computer.setHardDisk(1000);
                computer.setRam(8);
                computer.setMainBoard("lenovo-board");
                return computer;
            }
            case ASUS:{
                AsusComputer computer = new AsusComputer();
                computer.setCpu("i5-8300");
                computer.setDisplay("asus-display");
                computer.setHardDisk(1000);
                computer.setRam(8);
                computer.setMainBoard("asus-board");
                return computer;
            }
            default:{
                throw new IllegalArgumentException("无此品牌电脑");
            }
        }
    }
}
