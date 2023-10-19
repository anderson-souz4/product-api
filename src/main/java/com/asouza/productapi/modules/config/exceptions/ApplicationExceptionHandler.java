package com.asouza.productapi.modules.config.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(NameNotInformedException.class)
    public ResponseEntity<StandardError> handleNameNotInformedException(NameNotInformedException e, HttpServletRequest request) {
        StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), "Violação de Dados", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.valueOf(error.getStatus())).body(error);
    }

}
