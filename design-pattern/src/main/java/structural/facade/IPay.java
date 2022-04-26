package structural.facade;

/**
 * <h1>在线支付接口</h1>
 * @author wangjunhao
 **/
public interface IPay {
    /**
     * <h2>转账</h2>
     * @param transferPojo 转账数据
     * @return 请求响应
     */
    PayResponse transfer(TransferPojo transferPojo);
}
