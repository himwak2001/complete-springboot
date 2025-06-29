package com.app.controller;

import com.app.component.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@Scope("request")
public class TestController1 {
    @Autowired
    User user;

    @Autowired
    Student student;

    public TestController1() {
        System.out.println("TestController1 initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController1 Object Hashcode: " + this.hashCode() + ", User object hashcode: " + user.hashCode() + ", Student Object hashcode: " + student.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> fetchUserDetails() {
        System.out.println("fetch user api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
