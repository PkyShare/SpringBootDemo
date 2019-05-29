package com.pky.springbootdemo.web.admin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/login")
public class LoginController {

    @ResponseBody
    @GetMapping(value = "")
    public String testLogin(){
        return "测试成功";
    }
}
