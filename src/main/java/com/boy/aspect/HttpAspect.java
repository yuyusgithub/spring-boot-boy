package com.boy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by yuyu on 2017/10/11.
 */
@Aspect
@Component
public class HttpAspect {

    @Before("execution(public * com.boy.controller.ValidateController.addBoy())")
    public void log(){

    }
}
