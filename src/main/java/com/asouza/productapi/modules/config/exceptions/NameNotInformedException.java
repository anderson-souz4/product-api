package com.asouza.productapi.modules.config.exceptions;

public class NameNotInformedException extends RuntimeException{
    public NameNotInformedException(String message) {
        super(message);
    }
}
