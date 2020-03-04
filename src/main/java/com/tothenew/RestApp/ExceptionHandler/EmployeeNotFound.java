package com.tothenew.RestApp.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException
{
    public EmployeeNotFound(String message)
    {
        super(message);
    }
}
