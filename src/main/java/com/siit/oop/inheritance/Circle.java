package com.siit.oop.inheritance;

public class Circle extends Shape {

    public Circle() {
        super("color");
    }

    @Override
    public void move() {
        System.out.println("circle moves");
    }
}
