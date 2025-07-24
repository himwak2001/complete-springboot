package com.app.service;

import com.app.entity.UserAuthEntity;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserAuthEntityService {
    // method to register the user
    public UserDetails save(UserAuthEntity userAuth);
}
