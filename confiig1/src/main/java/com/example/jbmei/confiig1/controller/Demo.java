package com.example.jbmei.confiig1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Demo {

    /*@Value("${student.name}")*/
    private String name;

    @PostMapping("/test")
    public Object getConfig(){
        return name;
    }
}
