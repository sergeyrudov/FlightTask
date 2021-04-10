package com.spring.flight.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<IncorrectTicket> handleException(Exception exception) {
        IncorrectTicket data = new IncorrectTicket();
        data.setInfo("Incorrect ticket");
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
