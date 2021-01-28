package spring.boot.annotation.use;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.Application;

@DisplayName("注解切面测试")
@SpringBootTest(classes = {Application.class})
class AspectLearnUseTest {

    @Autowired
    private AspectLearnUse aspectLearnUse;

    @Test
    void test(){
        int x = 5, y = 2;
        System.out.println(aspectLearnUse.add(x, y));
        System.out.println(aspectLearnUse.reduce(x, y));
        System.out.println(AspectLearnUse.multiply(x, y));
    }
}