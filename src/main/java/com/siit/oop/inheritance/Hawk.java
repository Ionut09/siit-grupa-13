package com.siit.oop.inheritance;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Hawk extends Animal {

    public Hawk() {
        super("bird");
    }

    @Override
    public void move() {
        System.out.println("Hawk flies");
    }
}
