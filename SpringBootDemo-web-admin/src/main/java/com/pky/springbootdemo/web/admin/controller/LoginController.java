package com.pky.springbootdemo.web.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/login")
public class LoginController {

    @GetMapping(value = "")
    public String testLogin(){
        return "测试成功";
    }
}
