package com.fetek.spring.exceptions.advice;

import com.fetek.spring.controller.LoginController;
import com.fetek.spring.exceptions.ErrorCode;
import com.fetek.spring.exceptions.response.ApiExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;


@RestControllerAdvice(basePackageClasses = LoginController.class)
public class LoginControllerAdvice {

    @ExceptionHandler(BadCredentialsException.class)
    ResponseEntity<ApiExceptionResponse> handleRegistrationException(BadCredentialsException exception) {

        final ApiExceptionResponse response =
                new ApiExceptionResponse(ErrorCode.BAD_CREDENTIALS.code, exception.getMessage(),
                        HttpStatus.UNAUTHORIZED, ZonedDateTime.now());

        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
