package com.vinovos.controller;

import com.vinovos.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://provider/student/findAll", Collection.class).getBody();
    }

    @RequestMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
