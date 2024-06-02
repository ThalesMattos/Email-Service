package com.emailservice.emailservice.advice;

import com.emailservice.emailservice.core.exceptions.EmailServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(EmailServiceException.class)
    public ResponseEntity<String> handleEmailServiceException(EmailServiceException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage() + ", Causa: " + exception.getCause());
    }
}