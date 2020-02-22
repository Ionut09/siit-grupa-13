package com.siit.controlstatements;

import java.util.Scanner;

public class IfElse {


    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int i = scanner.nextInt();

        if (isEven(i)) {
            System.out.println(i + " is even");
            if (i % 3 == 0) {
                System.out.println(i + " is even and divisible with 3");
            }
        } else {
            System.out.println(i + " is odd ");
        }

        if (true) {

        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

}
