package se.use;

import se.MyAnnotation;

/**
 * 注解的使用
 *
 * @author wangjunhao
 **/
@MyAnnotation(value = "class", description = "classDescription")
public class MyAnnotationUse {
    @MyAnnotation("property")
    private String property;

    @MyAnnotation("method")
    public String getProperty(){
        return property;
    }
}
