package com.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLConnection {
    @Value("${db-username}")
    String username;

    @Value("${db-password}")
    String password;

    public MySQLConnection(){
        System.out.println("MySQLConnection bean is initialized in dev environment");
    }


    @PostConstruct
    public void init(){
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
