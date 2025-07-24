package com.app.controller;

import com.app.entity.UserAuthEntity;
import com.app.service.UserAuthEntityServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAuthController {
    @Autowired
    private UserAuthEntityServiceImple serviceImple;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserAuthEntity entity){
        serviceImple.save(entity);
        return ResponseEntity.status(201).body("User register successfully !!!");
    }

}
