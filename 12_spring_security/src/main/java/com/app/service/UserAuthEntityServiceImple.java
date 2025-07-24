package com.app.service;

import com.app.entity.UserAuthEntity;
import com.app.repository.IUserAuthEntityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserAuthEntityServiceImple implements IUserAuthEntityService, UserDetailsService {
    @Autowired
    private IUserAuthEntityRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails save(UserAuthEntity userAuth) {
        userAuth.setPassword(passwordEncoder.encode(userAuth.getPassword()));
        return repository.save(userAuth);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }
}
