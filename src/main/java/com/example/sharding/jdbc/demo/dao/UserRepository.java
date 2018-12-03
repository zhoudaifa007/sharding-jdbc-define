package com.example.sharding.jdbc.demo.dao;

import com.example.sharding.jdbc.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Daifa on 2018/12/2.
 */
@Mapper
public interface UserRepository {
    List<User> getAll();
}
