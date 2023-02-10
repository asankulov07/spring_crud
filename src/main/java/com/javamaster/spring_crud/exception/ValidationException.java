package com.javamaster.spring_crud.exception;

import com.javamaster.spring_crud.dto.UsersDto;

public class ValidationException extends Exception {
    private String message;
    public ValidationException(String message){}
    public String getMessage(){
        return message;
    }

}



