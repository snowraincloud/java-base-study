package creational.factory.factory_method;

import edu.wbu.pattern.creational.factory.common.IComputer;

/**
 * <h1>电脑工厂 接口</h1>
 *
 * @author wangjunhao
 **/
public interface IComputerFactory {
    /**
     * <h2>生产电脑</h2>
     * @return 电脑
     */
    IComputer createComputer();
}
