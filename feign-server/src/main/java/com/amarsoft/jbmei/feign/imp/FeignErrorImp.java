package com.amarsoft.jbmei.feign.imp;

import com.amarsoft.jbmei.entity.Student;
import com.amarsoft.jbmei.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignErrorImp implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器繁忙请稍后再试";
    }
}
