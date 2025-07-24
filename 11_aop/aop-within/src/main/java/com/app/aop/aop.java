package com.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aop {
    @Before("within(com.app.controller.EmployeeController)")
    public void beforeWithinAop(){
        System.out.println("testing before AOP !!!");
    }

    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeServiceAnnotation(){
        System.out.println("in before service annotation !!!");
    }

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeAnnotationPointcut(){
        System.out.println("in before general annotation");
    }
}
