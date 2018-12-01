package com.example.sharding.jdbc.demo.dao;

/**
 * Created by Daifa on 2018/11/29.
 */

import com.example.sharding.jdbc.demo.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderRepository {

    Long insert(Order model);

}