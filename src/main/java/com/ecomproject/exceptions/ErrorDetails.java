package com.ecomproject.exceptions;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorDetails {

    private String error;
    private String details;
    private LocalDateTime timestamp;
}
