package se;

import java.lang.annotation.*;

/**
 * <h1>自定义注解声明</h1>
 * <h2>元注解</h2>
 * @see Target 表示注解可以用于哪些地方。可能的 ElementType 参数包括：
 * CONSTRUCTOR：构造器的声明；
 * FIELD：字段声明（包括 enum 实例）；
 * LOCAL_VARIABLE：局部变量声明；
 * METHOD：方法声明；
 * PACKAGE：包声明；
 * PARAMETER：参数声明；
 * TYPE：类、接口（包括注解类型）或者 enum 声明。
 * @see Retention 表示注解信息保存的时长。可选的 RetentionPolicy 参数包括：
 * SOURCE：注解将被编译器丢弃；
 * CLASS：注解在 class 文件中可用，但是会被 VM 丢弃；
 * RUNTIME：VM 将在运行期也保留注解，因此可以通过反射机制读取注解的信息。
 * @see Documented 将此注解保存在 Javadoc 中
 * @see Inherited 允许子类继承父类的注解
 * @see Repeatable 允许一个注解可以被使用一次或者多次（Java 8）。
 *
 * @author wangjunhao
 **/
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
    String description() default "description";
}
