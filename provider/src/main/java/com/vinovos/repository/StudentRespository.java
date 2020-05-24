package com.vinovos.repository;

import com.vinovos.entity.Student;

import java.util.Collection;

public interface StudentRespository {
    public Collection<Student> findall();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);

}
