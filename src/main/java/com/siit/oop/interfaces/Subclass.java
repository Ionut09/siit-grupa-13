package com.siit.oop.interfaces;

public class Subclass extends Superclass {

    public static void main(String... args) {
        Superclass sup = new Subclass();
        Subclass sub = new Subclass();

        sup.doSomething();//varianta din Superclass, tipul lui sup
        sub.doSomething();//varianta din Subclass, tipul lui sub
    }

    public static void doSomething() {
        System.out.println("doSomething() from Subclass");
    }
}
