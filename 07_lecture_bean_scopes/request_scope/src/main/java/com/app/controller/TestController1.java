package com.app.controller;

import com.app.component.Student;
import com.app.component.User;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@Scope("session")
public class TestController1 {
    @Autowired
    User user;

    public TestController1() {
        System.out.println("TestController1 initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestController1 Object Hashcode: " + this.hashCode() + ", User object hashcode: " + user.hashCode());
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> fetchUserDetails() {
        System.out.println("fetch user api invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logoutSession(HttpServletRequest request){
        System.out.println("ending session");
        HttpSession session = request.getSession();
        session.invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
