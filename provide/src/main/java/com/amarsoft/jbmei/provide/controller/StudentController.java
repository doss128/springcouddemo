package com.amarsoft.jbmei.provide.controller;

import com.amarsoft.jbmei.provide.entity.Student;
import com.amarsoft.jbmei.provide.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String springApplicationName;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Collection<Student> findAll(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }


    @PostMapping("/save")
    public void save( Student student){
        System.out.println(student);
        studentService.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(Student student){
        System.out.println(student);
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        System.out.println(id);
        studentService.delete(id);
    }


    @GetMapping("/get")
    public String get(){
        return "请求到了"+springApplicationName+":"+port;
    }
}
