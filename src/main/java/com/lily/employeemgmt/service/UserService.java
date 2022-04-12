package com.lily.employeemgmt.service;

import com.lily.employeemgmt.model.User;
import com.lily.employeemgmt.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
