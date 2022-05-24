package com.example.springSecurityDemo.service;

import com.example.springSecurityDemo.dto.UserRegistrationDto;
import com.example.springSecurityDemo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
