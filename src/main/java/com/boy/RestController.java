package com.boy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuyu on 2017/10/11.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private BoyRepository boyRepository;

    @Autowired
    private BoyService boyService;



    @GetMapping(value = "/boys")
    public List<Boy> getBoy(){
        return boyRepository.findAll();
    }

    @PostMapping(value = "/boys")
    public Boy addBoy(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age){
        Boy boy = new Boy();
        boy.setAge(age);
        boy.setCupSize(cupSize);
        Boy boy1 = boyRepository.save(boy);
        return boy1;
    }

    @GetMapping(value = "/boys/{id}")
    public Boy getBoy1(@PathVariable("id") Integer id){
        return boyRepository.findOne(id);
    }

    @PutMapping(value= "/boys/{id}")
    public Boy getBoy2(@PathVariable("id") Integer id,@RequestParam Integer age,@RequestParam String cupSize){
        Boy boy = new Boy();
        boy.setAge(age);
        boy.setCupSize(cupSize);
        boy.setId(id);
        return boyRepository.save(boy);
    }

    @DeleteMapping(value = "/boys/{id}")
    public void getBoy4(@PathVariable("id") Integer id){
        boyRepository.delete(id);
    }

    @GetMapping(value = "/boys/age/{age}")
    public List<Boy> getBoy5(@PathVariable("age") Integer age){
        return boyRepository.findByAge(age);
    }

    @GetMapping(value = "/saveTwo")
    public void saveTwo(){
        boyService.insertTwo();
    }



}
