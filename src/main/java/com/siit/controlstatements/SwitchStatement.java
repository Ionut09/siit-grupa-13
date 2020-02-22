package com.siit.controlstatements;

import java.util.Scanner;

public class SwitchStatement {


    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Introduceti operatia: ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("a+b= " + (a + b));
                break;
            case "-":
                System.out.println("a-b= " + (a - b));
                break;

            case "*":
                System.out.println("a*b= " + a * b);
                break;

            case "/":
                System.out.println("a/b= " + (a / b));
                break;

            default:
                System.out.println("Bad operation!!!");
        }
    }


    //un program care sa afiseze nr de zile pt fiecare luna
    //input: numele lunii sau indexul

    private static void printNumberOfDays() {

    }
}
