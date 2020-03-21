package com.siit.oop.object_methods;

public class ObjectMethods {

    public static void main(String... args) {
        Class<? extends ObjectMethods> aClass = new ObjectMethods().getClass();
        System.out.println(aClass.toString());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getName());
    }
}
