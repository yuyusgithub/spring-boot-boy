package com.boy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by yuyu on 2017/10/11.
 */
@Aspect
@Component
public class HttpAspect {

    /**
     * 找到一个切入点，这里的切入点，就是定义时哪些类的哪些方法，关于execution表达式的格式，会在info。txt里面说明
     */
    @Pointcut("execution(* com.boy.controller.ValidateController.*(..))")
    public void point(){

    }

    @Before("point()")
    public void log(){
        System.out.println("开始执行   开始   操作");
    }
}
