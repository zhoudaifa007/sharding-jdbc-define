package com.example.sharding.jdbc.demo.service;

import com.example.sharding.jdbc.demo.dao.OrderItemRepository;
import com.example.sharding.jdbc.demo.dao.OrderRepository;
import com.example.sharding.jdbc.demo.model.Order;
import com.example.sharding.jdbc.demo.model.OrderItem;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Daifa on 2018/11/29.
 */


@Service
public class DemoService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private OrderItemRepository orderItemRepository;

    private AtomicLong atomicLong = new AtomicLong(100);

    private AtomicLong atomicLong1 = new AtomicLong(10001);

    public String insert(Integer userId) {

        Order order = new Order();
        order.setOrderId(atomicLong.addAndGet(1));
        order.setUserId(userId);
        order.setStatus("INSERT_TEST");
        orderRepository.insert(order);

        long orderId = order.getOrderId();
        OrderItem item = new OrderItem();
        item.setOrderItemId(atomicLong1.addAndGet(3));
        item.setOrderId(orderId);
        item.setUserId(userId);
        item.setStatus("INSERT_TEST");
        orderItemRepository.insert(item);

        return orderId + "|" + item.getOrderItemId();
    }
}