package com.example.test1123.controller;

import com.example.test1123.dao.Userdao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    Userdao userdao;

    @RequestMapping("/x")
    public String x(){

        int a=userdao.delete(6);
        System.out.println(a);
        return " ";
    }
}
