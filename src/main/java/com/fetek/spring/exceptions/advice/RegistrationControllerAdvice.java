package com.fetek.spring.exceptions.advice;

import com.fetek.spring.controller.RegistrationController;
import com.fetek.spring.exceptions.RegistrationException;
import com.fetek.spring.exceptions.response.ApiExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;


@RestControllerAdvice(basePackageClasses = RegistrationController.class)
public class RegistrationControllerAdvice {

    @ExceptionHandler(RegistrationException.class)
    ResponseEntity<ApiExceptionResponse> handleRegistrationException(RegistrationException exception) {

        final ApiExceptionResponse response = new ApiExceptionResponse(exception.getErrorCode().code,
                exception.getErrorMessage(),
                HttpStatus.BAD_REQUEST, ZonedDateTime.now());

        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
