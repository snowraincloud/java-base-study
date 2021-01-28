package spring.boot.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import spring.boot.annotation.InterceptLearn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
@Component
public class LearnIntercept implements AsyncHandlerInterceptor {

    private static final Logger l = LoggerFactory.getLogger(LearnIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        InterceptLearn interceptLearn = method.getAnnotation(InterceptLearn.class);
        if (interceptLearn != null){
            l.info(interceptLearn.toString());
        }
        return true;
    }
}
