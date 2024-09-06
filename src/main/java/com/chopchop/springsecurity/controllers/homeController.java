package com.chopchop.springsecurity.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest serv){
        System.out.println("output from the method - "+ serv.getSession().getId());
        return "hello world!" + serv.getSession().getId();
    }

}
