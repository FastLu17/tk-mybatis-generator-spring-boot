package com.lxf.tkmybatisspringboot.mapper;

import com.lxf.tkmybatisspringboot.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface UserMapper extends Mapper<User> {

    Map<String, Object> selectCreateDate(Integer id);
}