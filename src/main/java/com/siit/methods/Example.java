package com.siit.methods;

public class Example {
    private static int doSomething(String input) {
        if (input.equals("YES")) {
            return 1;
        }
        if (input.equals("NO")) {
            return 0;
        }
//        return -1;
        throw new IllegalArgumentException("Bad input");
    }

    public static void main(String... args) {

    }
}
