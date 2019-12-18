package com.amarsoft.jbmei.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cc")
public class ConfigClientController {
    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getconfig")
    public String getConfig(){
        System.out.println("请求成功");return port+"**"+foo;
    }

    @Value("${student.name}")
    private String name;

    @GetMapping("/test")
    public Object getConfig2(){
        return name;
    }
}
