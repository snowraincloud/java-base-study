package spring.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import spring.boot.annotation.AspectLearn;

import java.lang.reflect.Method;

/**
 * 切面注解
 * 只能切面 公共非静态方法
 * around > before > around > after > afterReturning
 * before(前置通知)： 在方法开始执行前执行
 * after(后置通知)： 在方法执行后执行
 * afterReturning(返回后通知)： 在方法返回后执行
 * afterThrowing(异常通知)： 在抛出异常时执行
 * around(环绕通知)： 在方法执行前和执行后都会执行
 * 链接：https://www.jianshu.com/p/4d22ea402d14
 * @author wangjunhao
 **/
@Aspect
@Component
public class LearnAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LearnAspect.class);


    @Pointcut(value = "@annotation(aspectLearn)", argNames = "aspectLearn")
    public void pointCut(AspectLearn aspectLearn){

    }

    @Around(value = "pointCut(aspectLearn)", argNames = "joinPoint, aspectLearn")
    public Object around(ProceedingJoinPoint joinPoint, AspectLearn aspectLearn) throws Throwable {
        try {
            LOGGER.info("around-begin:"+ aspectLearn);
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            LOGGER.info("around-end");
        }
    }


    @Before("@annotation(spring.boot.annotation.AspectLearn)")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AspectLearn aspectLearn = method.getAnnotation(AspectLearn.class);
        LOGGER.info("注解式拦截 " + aspectLearn);
    }
}
