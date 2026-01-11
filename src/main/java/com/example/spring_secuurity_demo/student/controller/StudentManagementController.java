package com.example.spring_secuurity_demo.student.controller;

import com.example.spring_secuurity_demo.student.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    List<Student> students = List.of(
            new Student(1, "Tony Stark"),
            new Student(2, "Bruce Wayne"),
            new Student(3, "Peter Parker"),
            new Student(4, "Darth Vader"),
            new Student(5, "Luke Skywalker"),
            new Student(6, "Harry Potter"),
            new Student(7, "Hermione Granger"),
            new Student(8, "Indiana Jones"),
            new Student(9, "Neo"),
            new Student(10, "John Wick"),
            new Student(11, "Jack Sparrow"),
            new Student(12, "Frodo Baggins"),
            new Student(13, "Thanos")
    );

    @GetMapping
    public List<Student> getAllStudents()   {
        return students;
    }

    @PostMapping
    public void addNewStudent(@RequestBody Student student)   {
        System.out.println("add NewStudent");
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable Integer studentId)   {
        System.out.println("delete Student");
    }

    @PutMapping("{studentId}")
    public void updateStudent(
            @PathVariable Integer studentId,
            @RequestBody Student student)   {
        System.out.println("delete Student");
    }

}
