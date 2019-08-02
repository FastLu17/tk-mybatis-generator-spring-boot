package com.lxf.tkmybatisspringboot.service;

import com.lxf.tkmybatisspringboot.entity.User;
import com.lxf.tkmybatisspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 小66
 * @Description:
 * @create: 2019-07-31 14:56
 **/
@Service
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        Example example = Example.builder(User.class).build();
        Example.Criteria criteria = example.createCriteria();
        criteria.andBetween("age", 1, 2);
        List<User> users = userMapper.selectByExample(example);
        System.out.println("users = " + users);
        return users;
    }

    public void updateUser() {
//        Example example = Example.builder(User.class).build();
        Example example = new Example(User.class);
        User user = new User();
        user.setTenantId(3L);
        userMapper.updateByExampleSelective(user, example);
    }

}
