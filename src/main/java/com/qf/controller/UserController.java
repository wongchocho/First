package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/Users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
