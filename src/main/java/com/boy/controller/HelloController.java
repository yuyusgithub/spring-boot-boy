package com.boy.controller;

import com.boy.properties.BoyPropoties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyu on 2017/10/10.
 */
@RestController
public class HelloController {

    /**
     * 可以通过@Value 注解，将配置文件里的 字段注入进来
     */
    @Value("${boy.cupSize}")
    private String cupSize;

    @Value("${boy.content}")
    private String content;

    /**
     * 将配置文件中的注入到对象中，再注入进来；
     */
    @Autowired
    private BoyPropoties boyPropoties;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String say() {
        return "Hello Boy!!" + "    " +cupSize+":"+content+  "#######" + boyPropoties.getContent();
    }
}
