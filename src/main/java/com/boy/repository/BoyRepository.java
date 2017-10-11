package com.boy.repository;

import com.boy.domain.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yuyu on 2017/10/11.
 */
public interface BoyRepository extends JpaRepository<Boy,Integer>{

    //这个地方，方法的命名是有讲究的，只有这么写，才能使用；
    public List<Boy> findByAge(Integer age);
}
