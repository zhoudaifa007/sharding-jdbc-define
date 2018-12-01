package com.example.sharding.jdbc.demo.controller;

import com.example.sharding.jdbc.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Daifa on 2018/11/29.
 */
@RestController
@RequestMapping(value = "/order")
public class TestController {

    @Autowired
    private DemoService demoService;

    @PostMapping
    public String insertOrder(Integer userId) {
        return demoService.insert(userId);
    }
}