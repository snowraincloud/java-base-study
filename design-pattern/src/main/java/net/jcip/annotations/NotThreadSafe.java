package net.jcip.annotations;

import java.lang.annotation.*;

/**
 * <h1>标注当前类是线程不安全</h1>
 *
 * @author wangjunhao
 **/
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface NotThreadSafe {
}
