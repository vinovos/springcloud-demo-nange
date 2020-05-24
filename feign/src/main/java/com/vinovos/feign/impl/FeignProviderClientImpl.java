package com.vinovos.feign.impl;

import com.vinovos.entity.Student;
import com.vinovos.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignProviderClientImpl implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.....";
    }
}
