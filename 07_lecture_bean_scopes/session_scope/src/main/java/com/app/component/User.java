package com.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class User {
    public User(){
        System.out.println("User instance initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object hashcode: " + this.hashCode());
    }

}
