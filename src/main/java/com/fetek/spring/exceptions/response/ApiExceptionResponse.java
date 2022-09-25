package com.fetek.spring.exceptions.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiExceptionResponse extends BaseErrorResponse {

    private String message;

    public ApiExceptionResponse(String code, String message, HttpStatus status, ZonedDateTime time) {
        setCode(code);
        this.message = message;
        setStatus(status);
        setTime(time);
    }

}
