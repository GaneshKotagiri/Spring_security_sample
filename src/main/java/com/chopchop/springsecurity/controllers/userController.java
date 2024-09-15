package com.chopchop.springsecurity.controllers;

import com.chopchop.springsecurity.model.User;
import com.chopchop.springsecurity.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    private userService service;


    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }
}
