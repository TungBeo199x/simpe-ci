package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiHello {

    @GetMapping(value = "hello")
    public String helloApi(){
        return "Đm anh Vinh";
    }
}
