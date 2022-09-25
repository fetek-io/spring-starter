package com.fetek.spring.exceptions;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
    private ErrorCode errorCode;
}
