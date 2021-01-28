package spring.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring.boot.intercepter.LearnIntercept;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private LearnIntercept learnIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(learnIntercept);
    }
}
