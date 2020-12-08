package com.panasonic.app.exception;

public class ServiceFoundException extends RuntimeException {

    public ServiceFoundException() {

        super("No exist service");
    }
}
