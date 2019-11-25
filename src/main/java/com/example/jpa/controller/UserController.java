package com.example.jpa.controller;

import com.example.jpa.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/get")
    public String getUser() {
        return userMapper.findAll().toString();
    }
}
