package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class EmployeeController {
    @GetMapping("/fetchUser")
    public String fetchUserDetail(){
        System.out.println("fetching user details !!!");
        return "fetch employee";
    }

    @GetMapping("/fetchList")
    public String fetchUserList(){
        System.out.println("fetching user list !!!");
        return "fetch employee list";
    }

    @GetMapping("/fetchUser/{userId}")
    public String fetchUserById(@PathVariable(value = "userId") String userId){
        System.out.println("fetch user by id: " + userId);
        return "Fetch User By Id";
    }
}
