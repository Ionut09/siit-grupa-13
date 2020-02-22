package com.siit.primitives;

import java.math.BigDecimal;
import java.util.Scanner;

public class PlayWithFloatingPrimitive {

    public static void main(String... args) {
        float firstFloat = 1.2F;
        double firstDouble = 1.2;

        //width 64
        double divisionBetweenIntegersDouble = 5 / 3d;
        //width 32
        float divisionBetweenIntegersFloat = 5 / 3f;

        System.out.println("divisionBetweenIntegersFloat" + divisionBetweenIntegersFloat);
        System.out.println("divisionBetweenIntegersDouble = " + divisionBetweenIntegersDouble);

        firstFloat = (float) firstDouble;
        divisionBetweenIntegersFloat = (float) divisionBetweenIntegersDouble;
        System.out.println("divisionBetweenIntegersFloat = " + divisionBetweenIntegersFloat);

        double d = (double) 2;
        //pt sume de bani
        BigDecimal decimal = new BigDecimal("2.456");

        double niceDoubleLiteral = 2_345.9_5_4_8_5;
        double uglyDouble = 2345.95485;
        int amount = 1_189_238_920;
        int amount2 = (int) 3_189_238_920L;

        double sum = niceDoubleLiteral + uglyDouble;

        double a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar: \n");
        a = sc.nextDouble();

        double trigIdentity = Math.pow(Math.sin(a), 2) + Math.pow(Math.cos(a), 2);
        System.out.println("trigIdentity = " + trigIdentity);

        double first = 8374874784.948394939483984983;
        double second = 8374874784.948394939483984983;
        System.out.println("first = second: " + (first == second));
    }
}
