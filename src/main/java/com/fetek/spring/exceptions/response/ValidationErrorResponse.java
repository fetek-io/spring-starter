package com.fetek.spring.exceptions.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class ValidationErrorResponse extends BaseErrorResponse {

    private List<String> message;

    public ValidationErrorResponse(String code, List<String> message, HttpStatus status, ZonedDateTime time) {
        setCode(code);
        this.message = message;
        setStatus(status);
        setTime(time);
    }

}
