package com.vinovos.repository.impl;

import com.vinovos.entity.Student;
import com.vinovos.repository.StudentRespository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRespositoryImpl implements StudentRespository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 22));
        studentMap.put(2l, new Student(2l, "李四", 23));
        studentMap.put(3l, new Student(3l, "王五", 24));
    }

    @Override
    public Collection<Student> findall() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
