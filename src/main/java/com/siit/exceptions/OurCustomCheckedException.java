package com.siit.exceptions;

public class OurCustomCheckedException extends Exception {//este de tip checked

    public OurCustomCheckedException(String message) {
        super(message);
        System.out.println(message);
    }
}
