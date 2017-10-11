package com.boy.controller;

import com.boy.domain.Boy;
import com.boy.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by yuyu on 2017/10/11.
 */
@org.springframework.web.bind.annotation.RestController
public class ValidateController {

    @Autowired
    private BoyRepository boyRepository;


    @PostMapping(value = "/addBoy")
    public Boy addBoy(@Valid Boy boy, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        Boy boy1 = boyRepository.save(boy);
        return boy1;
    }


}
