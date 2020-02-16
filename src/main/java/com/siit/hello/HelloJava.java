package com.siit.hello;

import java.util.Arrays;

/**
 * This is my First class
 * It is very <b>complex</b>
 */
public class HelloJava {
    /**
     *
     */
    public static void main(String... args) {

        System.out.println("Hello Java & " + Arrays.toString(args)); //print

        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Sum: " + sum);

//        main("1","2", "3");
//
//        //main(String[] args
//        String[] args1 = {"1", "2", "3"}; //array de String
//        main(args1);
    }
}

// this is a single line comment

/*
 * this is multi line commnent, but is not taken into account by javadoc
 */

/**
 * this is multi line commnent, or javadoc comment
 */