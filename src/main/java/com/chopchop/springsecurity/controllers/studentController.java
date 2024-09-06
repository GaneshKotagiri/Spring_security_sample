package com.chopchop.springsecurity.controllers;

import com.chopchop.springsecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {

    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"ganesh","java"),
            new Student(2,"gaya",".net")
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/student")
    public List<Student> getStudents(){

        return students;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
