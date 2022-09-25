package com.fetek.spring.exceptions.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
public abstract class BaseErrorResponse {
    private String code;
    private Object message;
    private HttpStatus status;
    private ZonedDateTime time;
}
