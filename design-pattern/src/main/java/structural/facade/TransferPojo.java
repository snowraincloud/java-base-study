package structural.facade;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <h1>转账数据</h1>
 *
 * @author wangjunhao
 **/
@Data
public class TransferPojo {
    private final String payer;
    private final String payee;
    private final BigDecimal amount;
    private final Integer type;
}
