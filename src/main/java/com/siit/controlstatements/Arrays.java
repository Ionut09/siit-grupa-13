package com.siit.controlstatements;

public class Arrays {

    public static void main(String... args) {

        String[] arrayString = new String[8];
        //arrayString[6]='a'; //does not work
        arrayString[6] = "Java";
        arrayString[5] = "C++";
        arrayString[4] = "PHP";
        for (String str : arrayString) {
            System.out.println("str = " + str);
        }
        System.out.println("\n\n\n");
        //next are equivalent
//        int[] matrix[];
//        int matrix[][];

        //va contine un array de null
        int[][] matrix1 = new int[3][];

        //va contine un array de arayuri, cu valori default
        int[][] matrix2 = new int[3][3];

        //nr de [] repr. nr de dimensiuni sau nr de acolade imbricate
        int[][] matrix3 = {
                {4, 4, 3},
                {5, 7, 4},
                {7, 8}
        };

        for (int[] unArrayDinMatrix : matrix3) {
            System.out.println("unArrayDinMatrix = "
                    + java.util.Arrays.toString(unArrayDinMatrix));
            for (int i : unArrayDinMatrix) {
                System.out.println("i = " + i);
            }
        }

        //System.out.println(matrix3[4]); // ArrayIndexOutOfBoundsException
        System.out.println(matrix3[matrix3.length - 1]); // ok
    }
}
