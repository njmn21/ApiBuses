package com.ApiBuses.ApiBuses.exception;

public class InvalidJwtTokenException extends RuntimeException{
    public InvalidJwtTokenException(String message) {
        super(message);
    }
}