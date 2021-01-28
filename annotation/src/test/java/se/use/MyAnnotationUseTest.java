package se.use;

import org.junit.jupiter.api.DisplayName;
import se.MyAnnotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("注解获取测试")
class MyAnnotationUseTest {

    @Test
    void test_getAnnotation(){
        var annotationUse = new MyAnnotationUse();
        var clazz = annotationUse.getClass();
        var annotationClazz = MyAnnotation.class;

        assertTrue(clazz.isAnnotationPresent(annotationClazz));
        var myAnnotation = clazz.getAnnotation(annotationClazz);
        System.out.println(myAnnotation);
        System.out.println(myAnnotation.value());
        System.out.println(myAnnotation.description());

        var fields = clazz.getDeclaredFields();
        for (var field : fields){
            assertTrue(field.isAnnotationPresent(annotationClazz));
            myAnnotation = field.getAnnotation(annotationClazz);
            System.out.println(myAnnotation);
            System.out.println(myAnnotation.value());
            System.out.println(myAnnotation.description());
        }

        var methods = clazz.getMethods();
        for (var method: methods){
            if (method.isAnnotationPresent(annotationClazz)){
                myAnnotation = method.getAnnotation(annotationClazz);
                System.out.println(myAnnotation);
                System.out.println(myAnnotation.value());
                System.out.println(myAnnotation.description());
            }
        }
    }

}