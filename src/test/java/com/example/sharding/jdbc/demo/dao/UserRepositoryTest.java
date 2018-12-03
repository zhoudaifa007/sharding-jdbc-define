package com.example.sharding.jdbc.demo.dao;

import com.alibaba.fastjson.JSONObject;
import com.example.sharding.jdbc.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Daifa on 2018/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        List<User> list = userRepository.getAll();
        System.out.println("start test" +  (System.currentTimeMillis() - start));
        System.out.println(JSONObject.toJSONString(list));
    }
}
