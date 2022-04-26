package structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>支付类型</h1>
 * @author wangjunhao
 **/
@Getter
@AllArgsConstructor
public enum PayEnum {
    ALI(1),
    WECHAT(2),
    EXCEPTION(-1),
    ;
    private int code;
}
