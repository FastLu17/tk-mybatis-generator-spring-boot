package com.lxf.tkmybatisspringboot.controller;

import com.lxf.tkmybatisspringboot.entity.User;
import com.lxf.tkmybatisspringboot.mapper.UserMapper;
import com.lxf.tkmybatisspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: 小66
 * @Description:
 * @create: 2019-07-31 15:58
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getList(){
        List<User> users = userService.getUsers();

        return users.toString();
    }

    @PutMapping("/user")
    public String updateUser(){
        userService.updateUser();

        return "A";
    }

    @GetMapping("/user")
    public Map<String,Object> getUserByPrimaryKey(){
        Map<String,Object> userMap = userService.selectCreateDate(1);
        System.out.println("userMap = " + userMap.get("createDate"));

        return userMap;
    }

}
