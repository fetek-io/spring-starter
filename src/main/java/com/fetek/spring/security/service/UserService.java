package com.fetek.spring.security.service;


import com.fetek.spring.model.User;
import com.fetek.spring.security.dto.AuthenticatedUserDto;
import com.fetek.spring.security.dto.RegistrationRequest;
import com.fetek.spring.security.dto.RegistrationResponse;

public interface UserService {

    User findByUsername(String username);

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
