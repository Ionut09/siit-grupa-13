package com.siit.methods;

public class CallTrace {
    public static void main(String... args) {
        firstMethod(4);
    }

    private static void firstMethod(int cifra) {
        System.out.println("firstMethod");
        String parity;
        if (cifra % 2 == 0) {
            parity = "e para";
        } else {
            parity = "e impara";
        }
        //folosit intotdeauna pentru a atribui o valoare unei
        // variabile sau pt a folosi valoarea in place (apel metoda)
        parity = (cifra % 2 == 0) ? methodThatReturnsAStr() : ("e impara" + "uraa");

        System.out.println(parity);
        secondMethod();
//        return; Intellij zice: 'return' is unnecessary as the last statement in a 'void' method
    }

    //nu poate returna void
    private static String methodThatReturnsAStr() {
        return "udsiudie";
    }

    private static void secondMethod() {
        System.out.println("secondMethod");
    }
}
