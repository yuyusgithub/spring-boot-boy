package com.boy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yuyu on 2017/10/11.
 */
@Service
public class BoyService {

    @Autowired
    private BoyRepository boyRepository;

    //使用@Transactional来开启事务
    @Transactional
    public void insertTwo(){
        Boy boy1 = new Boy();
        Boy boy2 = new Boy();


        boy1.setAge(14);
        boy1.setCupSize("A");

        boy2.setAge(15);
        boy2.setCupSize("BB");

        boyRepository.save(boy1);
        boyRepository.save(boy2);
    }
}
