package com.amarsoft.jbmei.controller;

import com.amarsoft.jbmei.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        String url="http://sonsume";
        return restTemplate.getForObject(url+"/sonsume/findAll",Collection.class);
    }

    @GetMapping("/get")
    public String get(){
        System.out.println("111");
        String url="http://provide";
        return restTemplate.getForEntity(url+"/student/get",String.class).getBody();
    }
}
