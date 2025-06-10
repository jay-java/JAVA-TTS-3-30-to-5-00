package com.sec.controller;

import com.sec.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Student_CSRF_Controller {

    private List<Student> list = new ArrayList<>(List.of(
            new Student(1,"java",23),
            new Student(2,"python",43)));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return list;
    }

    //we will return token from here and send
    @GetMapping("/csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    //try this with security it will shows error 404
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        list.add(student);
        return  student;
    }



}
