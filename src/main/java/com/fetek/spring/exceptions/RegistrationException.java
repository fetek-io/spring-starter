package com.fetek.spring.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class RegistrationException extends BaseException {

    private final ErrorCode errorCode = ErrorCode.INVALID_REGISTRATION;

    private final String errorMessage;

}
