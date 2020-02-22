package com.siit.controlstatements;

import java.util.Scanner;

public class WhileSTatement {

    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul: ");
        int number = scanner.nextInt();

        int length = String.valueOf(number).length();
        int[] digits = new int[length];
        int j = 0;
        while (number != 0) {
            int cifra = number % 10;
            digits[j] = cifra;
            j++;
            // i = i / 10; acceasi branza cu ->
            number /= 10;
        }

//        for (int digit : digits) {
//            System.out.println("digit = " + digit);
//        }

        for (int k = digits.length - 1; k >= 0; --k) {
            System.out.println("digits = " + digits[k]);
        }

    }
}
