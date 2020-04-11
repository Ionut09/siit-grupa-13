package com.siit.exceptions;

public class ResursaNoastra implements AutoCloseable {

    public void close() {
        System.out.println("close");
    }
}
