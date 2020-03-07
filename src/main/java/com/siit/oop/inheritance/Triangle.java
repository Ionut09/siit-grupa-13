package com.siit.oop.inheritance;

// There is no default constructor available in 'Shape'
public class Triangle extends Shape {

    public Triangle() {
        //insertia lui super e garantata de compiler
        this("white"); //nu mai pune super()
    }

    public Triangle(String color) {
        super(color);
    }


    @Override
    public void move() {
        System.out.println("--triangle moves");
        super.move(); //super. accesam membrii din superclasa
        System.out.println("--triangle moves");
    }
}
