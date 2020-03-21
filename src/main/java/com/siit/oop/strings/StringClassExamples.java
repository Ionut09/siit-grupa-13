package com.siit.oop.strings;

public class StringClassExamples {

    public static void main(String... args) {
        String input = "Grupa 13 e cea mai  tare";

        char[] charactereleStringului = input.toCharArray();

        System.out.println(input.indexOf('u'));
        System.out.println(input.indexOf("u"));
        String replace = input.replace("e", "F");
        System.out.println(replace);
        System.out.println(input.replaceAll("\\s+", "F"));
        System.out.println(input.replaceAll(" ", "F"));

        System.out.println(input.substring(6));
        System.out.println(input.substring(6, 8));
        System.out.println(input.indexOf('1'));
        System.out.println(input.indexOf('3'));

        //la fel, pt ca String e immutable
        System.out.println(input.toLowerCase());
        input = input.trim().toUpperCase().replace("a", "d");
        System.out.println(input);
        input.toUpperCase();
        input.replace(" ", "jsj");
        System.out.println(input);

    }
}
