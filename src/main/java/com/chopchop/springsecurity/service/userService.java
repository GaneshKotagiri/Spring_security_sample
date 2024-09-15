package com.chopchop.springsecurity.service;

import com.chopchop.springsecurity.model.User;
import com.chopchop.springsecurity.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    private userRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }

}
