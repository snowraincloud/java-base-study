package net.jcip.annotations;

import java.lang.annotation.*;

/**
 * <h1>标注当前类是线程安全的</h1>
 *
 * @author wangjunhao
 **/
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface  ThreadSafe {
}
