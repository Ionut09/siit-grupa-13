package com.siit.oop.strings;

public class StringBuilderExample {

    public static void main(String... args) {
        StringBuilder sb = new StringBuilder("Grupa 13 e cea mai  tare");

        sb.append(" dintre toate");
        System.out.println(sb);
        sb.reverse();
        String input = "assgssa";
        System.out.println("Is palindrom: " + new StringBuilder(input).reverse().toString().equals(input));
    }
}
