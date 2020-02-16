package com.siit.primitives;

public class PlayWithIntegerPrimitives {

    public static void main(String... args) {
        int a;
        int b, c = 10; //nu recomand declararea mai multor variabile in acelasi timp

        int d = 10;
        byte by = 19;
        short sh = 1;
        char ch = 'a';

        int sumChar = 'a' + 2;
        System.out.println("sumChar = " + sumChar);

        int maxValue = Integer.MAX_VALUE;
        long maxValue1 = Long.MAX_VALUE;
        float f = Float.MAX_VALUE;
        long longg = 8943298473948928492L;

        int sumTooBigInt = 1998339323 + 1983393237; //va apare numeric overflow,
        // adica este depasita capacitatea varibilei de tip int
        long sumTooBigLong = 1998339323L + 1983393237;
        System.out.println("sumTooBigInt with integers: " + sumTooBigInt +
                "\nsumTooBigLong with longs: " + sumTooBigLong);

        System.out.println("3/2 = " + 3 / 2); //1
        System.out.println("3/2.0 = " + 3 / 2.0); //1.5
        System.out.println("3/2.0F = " + 3 / 2.0F); //1.5
        System.out.println("3.0/2.0 = " + 3.0 / 2.0); //1.5
    }
}
