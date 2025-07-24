package com.app.controller;

import com.app.service.Employeeutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class EmployeeController {
    @Autowired
    Employeeutil employeeutil;

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

    @GetMapping("/testUtil")
    public String testEmployeeutils(){
        System.out.println("in the test employee util !!!");
        employeeutil.getEmployeeDetails();
        return "";
    }
}
