package com.siit.controlstatements;

public class ForStatement {

    static int oVariabilaStaticaSauDeClasa;
    int oVariabilaDeInstanta;
    String s = null;
    String s1 = "null";

    public static void main(String... args) {

        for (int i = 0; i < 10; i++) { //i se vede de aici
            if (i % 2 == 0) {
                System.out.println(i);
            }
            //pana aici
        }

        int i = 0; //poate fi declarat in afara
        for (; i < 10; i++) {

        }
        System.out.println("i = " + i);

        //for(;;){}
        //echivalent cu
//        for (; true; ) {
//        }

//        for (int k = 0; true; ) { //avem deja i in scope
//        }

        for (int j = 10; isGreaterThan5(j); --j) { //BAD
            //asa nu
        }

        int j = 10;
        while (isGreaterThan5(j)) {
            //asa da
        }

        System.out.println("oVariabilaStaticaSauDeClasa = " + oVariabilaStaticaSauDeClasa);

    }

    private static boolean isGreaterThan5(int j) {
        return j > 5;
    }

}
