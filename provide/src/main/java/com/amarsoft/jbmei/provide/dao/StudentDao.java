package com.amarsoft.jbmei.provide.dao;

import com.amarsoft.jbmei.provide.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface StudentDao extends JpaRepository<Student,Integer> {
    /**
     * 根据主键查找
     * @param no
     * @return
     */
    @Query(value = "select * from students where no=?1",nativeQuery = true)
    Collection<Student> queryById(Integer no);

}
