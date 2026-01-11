package com.example.spring_secuurity_demo.student.controller;

import com.example.spring_secuurity_demo.student.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

@GetMapping("/{studentId}")
    public Student getStudent(
            @PathVariable Integer studentId
)   {

}



}
