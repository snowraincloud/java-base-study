package structural.facade;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <h1>支付外观类</h1>
 * @author wangjunhao
 **/
public class Payment implements IPay {

    private static final AliPay ALI_PAY = new AliPay();
    private static final WechatPay WECHAT_PAY = new WechatPay();

    private static final Map<Integer, IPay> TRANSFER_MAP = new HashMap<>();

    static {
        TRANSFER_MAP.put(PayEnum.ALI.getCode(), ALI_PAY);
        TRANSFER_MAP.put(PayEnum.WECHAT.getCode(), WECHAT_PAY);
    }

    @Override
    public PayResponse transfer(TransferPojo transferPojo) {
        return Optional.ofNullable(TRANSFER_MAP.get(transferPojo.getType()))
                .orElseThrow(() -> new RuntimeException("支付类型错误"))
                .transfer(transferPojo);
    }
}
