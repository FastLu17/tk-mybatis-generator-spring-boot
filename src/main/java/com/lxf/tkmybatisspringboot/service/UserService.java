package com.lxf.tkmybatisspringboot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxf.tkmybatisspringboot.entity.User;
import com.lxf.tkmybatisspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

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
    //dev commit 2次。

    public List<User> getUsers() {
        Example example = Example.builder(User.class).build();
        Example.Criteria criteria = example.createCriteria();
        criteria.andBetween("age", 1, 2);
        List<User> users = userMapper.selectByExample(example);
        System.out.println("users = " + users);
        //dev commit 3次。
        return users;
    }

    public void updateUser() {
//        Example example = Example.builder(User.class).build();
        Example example = new Example(User.class);
        User user = new User();
        user.setTenantId(3L);
        userMapper.updateByExampleSelective(user, example);
    }

    public Map<String, Object> selectCreateDate(Long l) {
        return userMapper.selectCreateDate(l);
    }

    public void insertUser(User user) {

        userMapper.insertUserById(user);
    }

    public PageInfo<User> getList(){
        PageHelper.startPage(1, 5);
        List<User> list = userMapper.getList();
        return new PageInfo<>(list);
    }
}
