package com.dodo.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler({EntityNotFoundException.class})
    public String entityNotFound(){
        return "Entity not found";
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public String iaException(){
        return "Wrong argument";
    }
}
