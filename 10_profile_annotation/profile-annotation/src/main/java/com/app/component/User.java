package com.app.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class User {
    public User(){
        System.out.println("User bean initialized in production environment");
    }

}
