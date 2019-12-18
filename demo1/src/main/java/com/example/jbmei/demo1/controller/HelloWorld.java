package com.example.jbmei.demo1.controller;

import com.example.jbmei.demo1.aop.AspectDemo;
import com.example.jbmei.demo1.aop.Demo1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{
    private final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @AspectDemo(value = "123",rate = "321")
    @RequestMapping("hello")
    public String hello(){
        logger.info("333");
        return "nihao";
    }
}
