package com.amarsoft.jbmei.controller;

import com.amarsoft.jbmei.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/sonsume")
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${zuul.server.port}")
    private String zuulPort;

    @Value("${zuul.server.Ip}")
    private String zuulIp;

    private String hand="http://";

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        String url=hand+zuulIp+":"+zuulPort+"/provide/student/findAll";
        System.out.println(url);
        return restTemplate.getForEntity(url,Collection.class).getBody();
    }

    @GetMapping("/get")
    public String get(){
        String url=hand+zuulIp+":"+zuulPort+"/provide/student/get";
        return restTemplate.getForEntity(url,String.class).getBody();
    }
}
