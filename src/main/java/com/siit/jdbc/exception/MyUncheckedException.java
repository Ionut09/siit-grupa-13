package com.siit.jdbc.exception;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(Exception e) {
        super(e);
    }

    public MyUncheckedException(String message) {
        super(message);
    }
}
