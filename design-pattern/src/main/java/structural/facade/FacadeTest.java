package structural.facade;

import java.math.BigDecimal;

/**
 * <h1>外观模式</h1>
 * <p>为程序库、 框架或其他复杂类提供一个简单的接口。</p>
 * <p>外观（Facade）模式包含以下主要角色。</p>
 * <ol>
 * 	<li>
 * 		外观（Facade）角色：为多个子系统对外提供一个共同的接口。</li>
 * 	<li>
 * 		子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。</li>
 * 	<li>
 * 		客户（Client）角色：通过一个外观角色访问各个子系统的功能。</li>
 * </ol>
 * @author wangjunhao
 **/
public class FacadeTest {
    public static void main(String[] args) {
        Payment payment = new Payment();
        try {
            for (PayEnum value : PayEnum.values()) {
                TransferPojo transferPojo = new TransferPojo("payer", "payee",
                        new BigDecimal("10.5"), value.getCode() );
                System.out.println(payment.transfer(transferPojo));
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
