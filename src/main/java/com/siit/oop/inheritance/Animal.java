package com.siit.oop.inheritance;

import lombok.Getter;

public abstract class Animal {

    static {
        System.out.println("some");
    }
//
//    public void setSpecies(String s) {
//        this.species = s;
//    }

    @Getter
    private final String species;

    {
//        System.out.println("some" + species);
//        new Animal(""){
//            @Override
//            public void move() {
//
//            }
//        };
    }

    public Animal(String species) {
        toString();
        equals(this);
        hashCode();
        this.species = species;
    }

    //cannot be static or final
    public abstract void move();
}
