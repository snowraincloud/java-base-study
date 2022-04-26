package structural.facade;

/**
 * <h1>支付宝支付</h1>
 * @author wangjunhao
 **/
public class AliPay implements IPay {

    @Override
    public PayResponse transfer(TransferPojo transferPojo) {
        System.out.format("支付宝转账：%s转给%s $%f\n", transferPojo.getPayer(), transferPojo.getPayee(), transferPojo.getAmount());
        return new PayResponse("支付宝转账成功");
    }
}
