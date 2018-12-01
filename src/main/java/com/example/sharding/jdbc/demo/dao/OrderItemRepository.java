package com.example.sharding.jdbc.demo.dao;

/**
 * Created by Daifa on 2018/11/29.
 */
import com.example.sharding.jdbc.demo.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

//@Mapper和MapperScan效果是等价的
@Mapper
public interface OrderItemRepository {
    Long insert(OrderItem model);
}