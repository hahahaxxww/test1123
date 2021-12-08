package com.example.test1123;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test1123.dao")
public class Test1123Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1123Application.class, args);
    }

}
