package com.tothenew.RestApp.ExceptionHandler;

import java.util.Date;

public class ExceptionResponse
{
    Date  date;
    String message;
    String description;

    public ExceptionResponse(Date date, String message, String description) {
        this.date = date;
        this.message = message;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
