package com.boy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yuyu
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * 找到一个切入点，这里的切入点，就是定义时哪些类的哪些方法，关于execution表达式的格式，会在info。txt里面说明
     */
    @Pointcut("execution(* com.boy.controller.ValidateController.*(..))")
    public void point(){

    }

    @Before("point()")
    public void log(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request =  attributes.getRequest();

        logger.info("URL={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("IP={}",request.getRemoteAddr());
        logger.info("class name={}:",joinPoint.getSignature().getDeclaringTypeName());
        logger.info("方法={}:",joinPoint.getSignature().getName());
        logger.info("参数={}:",joinPoint.getArgs());
        logger.info("参数={}:",joinPoint.getArgs());
        logger.info("开始执行   开始   操作");
    }

    @After("point()")
    public void lo1(){
        System.out.println("开始执行   结束！   操作");
    }


    @AfterReturning(pointcut = "point()",returning = "object")
    public String ssss(Object object){
        logger.info("return:={}",object);
        return null;
    }



}
