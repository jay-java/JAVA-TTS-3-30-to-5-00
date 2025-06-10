package com.sec.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return  "msg : "+request.getSession().getId();
    }
    
}
