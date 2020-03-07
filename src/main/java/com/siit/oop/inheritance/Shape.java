package com.siit.oop.inheritance;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void erase() {
        this.draw();
        System.out.println("erase shape");
    }

    public void draw() {
        System.out.println("draw shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("move shape");
    }
}
