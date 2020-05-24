package com.vinovos.controller;

import com.vinovos.entity.Student;
import com.vinovos.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRespository studentRespository;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRespository.findall();
    }

    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRespository.findById(id);
    }

    @RequestMapping("/save")
    public void save(@RequestBody Student student){
        studentRespository.saveOrUpdate(student);
    }

    @RequestMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRespository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口:" + port;
    }
}
