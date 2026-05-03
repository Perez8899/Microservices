package com.microservice.student.service;

import com.microservice.student.entities.Student;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student finById(Long id);
    void save(Student student);
    List<Student> findByCourseId(Long courseId);

}
