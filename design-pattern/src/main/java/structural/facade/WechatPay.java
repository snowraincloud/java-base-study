package structural.facade;

/**
 * <h1>微信支付</h1>
 * @author wangjunhao
 **/
public class WechatPay implements IPay {

    @Override
    public PayResponse transfer(TransferPojo transferPojo) {
        System.out.format("微信转账：%s转给%s $%f\n",
                transferPojo.getPayer(), transferPojo.getPayee(), transferPojo.getAmount());
        return new PayResponse("微信转账成功");
    }
}
