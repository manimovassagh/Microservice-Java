package com.github.com.ProductCode.config;

public class SQLException extends RuntimeException{

    public SQLException(String message) {
        super(message);
    }

    public SQLException(String message, Throwable cause) {
        super(message, cause);
    }
}
