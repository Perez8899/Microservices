package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090")
public interface StudentClient {  //HTTP configuration to consume the student service

    @GetMapping("/api/student/search-by-course/{courseId}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long courseId);
}