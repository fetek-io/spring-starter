package com.fetek.spring.exceptions;

public enum ErrorCode {
    INVALID_REGISTRATION("INVALID_REGISTRATION"),
    VALIDATION_FAILED("VALIDATION_FAILED"),
    BAD_CREDENTIALS("BAD_CREDENTIALS");
    public final String code;

    ErrorCode(String code) {
        this.code = code;
    }
}
