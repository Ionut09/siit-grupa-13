package com.siit.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VarArgs {
    public static void main(String... args) {
        int[] ints = new int[2];
        ints[0] = 5;
        ints[1] = 7;
        methodWithArrayArg(ints);

//        methodWithVarArgs(ints);
        methodWithVarArgs(); //input.lentgh =0
        Integer anInteger = 7;
        methodWithVarArgs(5, 7, 8, 9, 1);
//        methodWithVarArgs(ints);
        List<Integer> list = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdu o variabila: ");
            try {
                int nextInt = sc.nextInt();
                list.add(nextInt);
            } catch (Exception ex) {
                break;
            }
        }
        methodWithVarArgs(list.toArray(new Integer[0]));
    }

    public static void methodWithArrayArg(int[] input) {
        for (int i : input) {
            System.out.println("arg: " + i);
        }
    }

    public static void methodWithVarArgs(Integer... input) {
        for (int i = 0; i <= input.length - 1; i++) {

        }
        for (int i : input) {
            System.out.println("arg: " + i);
        }
    }
}
