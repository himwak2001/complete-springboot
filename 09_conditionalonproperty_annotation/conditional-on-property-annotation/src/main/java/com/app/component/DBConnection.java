package com.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    MySQLConnection mySQLConnection;

    @Autowired(required = false)
    NoSQLConnection noSQLConnection;

    @PostConstruct
    public void init(){
        System.out.println("DBConnection bean is created and dependency injected !!!");
        System.out.println("is MySQLConnection object is null: " + Objects.isNull(mySQLConnection));
        System.out.println("is NoSQLConnection object is null: " + Objects.isNull(noSQLConnection));
    }
}
