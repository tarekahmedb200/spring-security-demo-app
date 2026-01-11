package com.example.spring_secuurity_demo.student.controller;

import com.example.spring_secuurity_demo.student.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

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


    @GetMapping("/{studentId}")
    public Student getStudent(
            @PathVariable Integer studentId
    )   {
      return   students.stream()
              .filter((student) -> Objects.equals(student.studentId(), studentId))
              .findFirst().orElseThrow();
    }



}
