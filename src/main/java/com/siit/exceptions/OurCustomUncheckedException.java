package com.siit.exceptions;

public class OurCustomUncheckedException extends RuntimeException {//este de tip unchecked

    public OurCustomUncheckedException(String message) {
        super(message);
        System.out.println(message);
    }
}
