//Q6. Imploement Exception Handling for resource not found

package com.tothenew.RestApp.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity handleEmployeeNotFoundException(EmployeeNotFound ex, WebRequest request) {
        ExceptionResponse exception = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(true));
        ResponseEntity resp = new ResponseEntity(exception, HttpStatus.NOT_FOUND);
        return resp;
    }
}