package com.siit.tema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;

class AnotherClass {

    protected List method() {
        return List.of("");
    }

    public static void main(String... args) {
        Tema1.getInstance();
        Tema1.getInstance();
        Tema1.getInstance();
        Tema1.getInstance();
        Tema1.getInstance();
//        Tema1 ob1 = new Tema1();
//        Tema1 ob2 = new Tema1();
//        Tema1 ob3 = new Tema1();
//        Tema1 ob23 = new Tema1();
//        Tema1 o4 = new Tema1();

        AnotherClass ac = Tema1.getInstance();
        List returnedObject = ac.method(); //orice tip covariant, subtip

        System.out.println(returnedObject instanceof Vector);
        System.out.println(returnedObject.getClass().getSimpleName());
    }
}

public class Tema1 extends AnotherClass {


    //    @Override
    public Vector method() {
        super.method();
        System.out.println("dabdkjs");
        return new Vector();
    }

    private static Tema1 instance = new Tema1();

    public static Tema1 getInstance() {
        char[] arr = new char[9];
        return instance;
    }

    private Tema1() {
        method();
//        method(122222);
        //heavy resources to obtain
    }


    List<String> stringList = new LinkedList<>();
//    LinkedList is a List

    public static void main(String... args) {
        int[][] m = {
                {4, 4, 8},
                {5},
                {7, 8, 9}
        };

        Tema1.checkSquareMatrix(m);

        int[] arr = {70, 10, 20, 20, 10, 40, 30, 40, 50, 70};
        String stringArrayWithoutDuplicates = removeDuplicates(arr);
        System.out.println("stringArrayWithoutDuplicates = " + stringArrayWithoutDuplicates);

        int parsedInt = parseInt("10");

        int maxValue = MAX_VALUE;
    }

    public static void checkSquareMatrix(int[][] m) {

        ArrayList<Object> objects = new ArrayList<>();
        var matrixLength = m.length;
        if (matrixLength == 0) {
            System.out.println("The matrix is not square");
        }
        boolean isSquare = true;
        for (int i = 0; i <= matrixLength - 1; i++) {
            if (m[i].length != matrixLength) {
                isSquare = false;
                break; //return;
            }
        }
        if (isSquare) {
            System.out.println("The matrix is square");
        } else {
            System.out.println("The matrix is not square");
        }
    }

    private static String removeDuplicates(int[] arr) {
        //orice clasa are un fully-qualified-name=pachet.ClassName unic
        Arrays.sort(arr);
        int length = arr.length;

        if (length == 0 || length == 1) {
            return Arrays.toString(arr);
        }
        int j = 0;
        for (int i = 0; i <= length - 2; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
                System.out.println(arr[i]);
            }
        }
        arr[j] = arr[length - 1];

        String output = "[";
        for (int k = 0; k <= j; k++) {
            if (k == j) {
                output = output + arr[k] + "]";
            } else {
                output = output + arr[k] + ", ";
            }
        }
        return output;
    }
}
