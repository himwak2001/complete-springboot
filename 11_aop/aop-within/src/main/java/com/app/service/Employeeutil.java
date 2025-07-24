package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class Employeeutil {
    public Employeeutil(){
        System.out.println("Employee util is initialized !!!");
    }

    public void getEmployeeDetails(){
        System.out.println("getting employee details !!!");
    }
}
