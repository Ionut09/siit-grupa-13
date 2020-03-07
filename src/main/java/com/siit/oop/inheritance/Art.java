package com.siit.oop.inheritance;

public class Art {

    public static void main(String... args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.erase();
        triangle.setColor("green");
        System.out.println("triangle.color = " + triangle.getColor());
        triangle.move(); //triangle moves

        Shape shape = new Triangle();
        //acum, javac nu stie ca shape pointeaza catre un triunghi
        System.out.println("------------------\n");
        shape.move(); //triangle moves

        System.out.println("------------------\n");
        Shape circle = new Circle();
        circle.move();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
//        shapes.for + Ctrl+space
        System.out.println("\nBegin iteration: ------------------");
        for (Shape shape1 : shapes) {
            shape1.move();
        }

        Shape aShape = new Shape("ixub");
    }
}
