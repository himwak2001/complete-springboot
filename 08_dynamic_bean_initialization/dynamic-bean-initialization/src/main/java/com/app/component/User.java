package com.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Order order;

    public User(){
        System.out.println("User instance initialization !!!");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object hashcode: " + this.hashCode() + ", Order object hashcode: " + order.hashCode());
    }
}
