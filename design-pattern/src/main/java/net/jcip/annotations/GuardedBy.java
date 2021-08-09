package net.jcip.annotations;

import java.lang.annotation.*;

/**
 * <h1>标识每个需要加锁的状态变量以及保护该变量的锁</h1>
 *
 * @author wangjunhao
 **/
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface GuardedBy {
    String value();
}
