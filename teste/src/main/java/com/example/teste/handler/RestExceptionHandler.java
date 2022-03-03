package com.example.teste.handler;

import com.example.teste.model.error.ErrorMessage;
import com.example.teste.model.exception.ResourceNotFoundException;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;


@ControllerAdvice
public class RestExceptionHandler {

        @ExceptionHandler (ResourceNotFoundException.class)
        public ResponseEntity <?> handlerResourceNotFoundException(ResourceAccessException ex){

                var error = new ErrorMessage("Not Found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
                return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
    
}