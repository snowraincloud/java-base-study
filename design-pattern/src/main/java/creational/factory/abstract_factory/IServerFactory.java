package creational.factory.abstract_factory;

/**
 * <h1>服务器工厂 接口</h1>
 *
 * @author wangjunhao
 **/
public interface IServerFactory {
    /**
     * <h1>生产服务器</h1>
     * @return 服务器
     */
    IServer createServe();
}
