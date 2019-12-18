package com.amarsoft.jbmei.provide.service;

import com.amarsoft.jbmei.provide.dao.StudentDao;
import com.amarsoft.jbmei.provide.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    public Collection<Student> findAll() {
        return studentDao.findAll();
    }

    public Collection<Student> findById(Integer id) {
        return studentDao.queryById(id);
    }

    public void saveOrUpdate(Student student) {
        studentDao.save(student);
    }

    public void delete(Integer id) {
        studentDao.deleteById(id);
    }
}
