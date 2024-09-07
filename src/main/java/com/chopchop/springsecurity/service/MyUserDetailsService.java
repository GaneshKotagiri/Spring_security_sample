package com.chopchop.springsecurity.service;

import com.chopchop.springsecurity.model.User;
import com.chopchop.springsecurity.model.userPrinciple;
import com.chopchop.springsecurity.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private userRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       User user= repo.findByUsername(username);
       if(user==null){
           System.out.println("user not found- console exception");
           throw new UsernameNotFoundException("user 404");
       }
        return new userPrinciple(user);
    }
}
