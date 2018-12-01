package com.example.sharding.jdbc.demo.dao;

import com.example.sharding.jdbc.demo.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by Daifa on 2018/12/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderRepositoryTest {

    @Resource
    private OrderRepository orderRepository;

    @Test
    public void test1(){
        Order order = new Order();
        order.setUserId(10);
        order.setOrderId(2000);
        order.setStatus("10-1000");
        orderRepository.insert(order);
    }

    @Test
    public void test2(){
        Order order = new Order();
        order.setUserId(11);
        order.setOrderId(2000);
        order.setStatus("11-2000");
        orderRepository.insert(order);
    }

    @Test
    public void test3(){
        Order order = new Order();
        order.setUserId(11);
        order.setOrderId(2001);
        order.setStatus("11-2001");
        orderRepository.insert(order);
    }

    @Test
    public void test4(){
        Order order = new Order();
        order.setUserId(10);
        order.setOrderId(2001);
        order.setStatus("10-2001");
        orderRepository.insert(order);
    }
}
