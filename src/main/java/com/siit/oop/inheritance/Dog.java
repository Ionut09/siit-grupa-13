package com.siit.oop.inheritance;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Dog extends Animal {
    private static int legs = 4;

    public Dog() {
        super("canise");
    }

    @Override
    public void move() {
        super.toString();
        System.out.println("Dog running");
    }
}
