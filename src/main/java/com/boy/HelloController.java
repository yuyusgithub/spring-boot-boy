package com.boy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyu on 2017/10/10.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "Hello Boy!!";
    }
}
