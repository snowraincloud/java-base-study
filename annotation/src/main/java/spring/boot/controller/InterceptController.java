package spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.annotation.InterceptLearn;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
@RequestMapping("intercept")
@RestController
public class InterceptController {

    @InterceptLearn
    @GetMapping
    public String get(){
        return "intercept-controller-get";
    }

    @InterceptLearn("post")
    @PostMapping
    public String post(){
        return "intercept-controller-post";
    }
}
