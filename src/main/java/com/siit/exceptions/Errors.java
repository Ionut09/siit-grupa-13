package com.siit.exceptions;

public class Errors {

    public static void main(String... args) {
        recursiveCall();
    }

    private static void recursiveCall(){
        System.out.println("one call");
        recursiveCall();
    }
}
