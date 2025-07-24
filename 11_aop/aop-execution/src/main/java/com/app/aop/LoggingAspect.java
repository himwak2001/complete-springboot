package com.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // tell SC that this class's method might need interception
public class LoggingAspect {

//    // * wildcard character -> matches any single item
//    // matches the particular method in the particular class
//    @Before("execution(public String com.app.controller.EmployeeController.fetchUserDetails())")
//    public void beforeFetchMethod(){
//        System.out.println("in the before fetch method");
//    }
//
//    // (*) matches any return type
//    @Before("execution(* com.app.controller.EmployeeController.fetchUserList())")
//    public void beforeFetchList(){
//        System.out.println("Before fetch list !!!");
//    }
//
//    // any return type, any method in EmployeeController having single parameter as String
//    @Before("execution(* com.app.controller.EmployeeController.*(String))")
//    public void beforeFetchById(){
//        System.out.println("in before fetch by id !!!");
//    }
//
//    // matches fetchUser by id method that take any single argument
//    @Before("execution(String com.app.controller.EmployeeController.fetchUserById(*))")
//    public void beforeFetchSingleParameter(){
//        System.out.println("in before fetch single parameter");
//    }

    // (..) wildcard -> matches 0 or more item
    @Before("execution(String com.app.controller.EmployeeController.fetchUserDetails(..))")
    public void beforeFetchMethod() {
        System.out.println("in the before fetch method");
    }

    @Before("execution(String com.app.controller..fetchUserDetails())")
    public void beforeFetchMethodAny() {
        System.out.println("in the before fetch method any");
    }
}
