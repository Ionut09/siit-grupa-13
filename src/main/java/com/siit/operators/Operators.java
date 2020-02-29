package com.siit.operators;

public class Operators {

    public static void main(String... args) {
        int contor = 5;
//        System.out.println(++contor); //6
//        System.out.println(contor++); //5
//        System.out.println(contor); //6

        int result = contor++; //5
        System.out.println(contor); //6

        int contor2 = 10;
        int result2 = ++contor2; //11
        System.out.println(contor); //11
        //identic pentru --

        String multilineString = "Deprecated\t Gradle features" +
                " were used in \nthis build, making" +
                " it incompatible with Gradle 7.0.";
        System.out.println("multilineString = " + multilineString);
    }

    //schimbari in stash
    //
    //

}
