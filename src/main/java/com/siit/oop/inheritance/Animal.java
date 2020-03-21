package com.siit.oop.inheritance;

public abstract class Animal {

    private String species;

    public Animal(String species) {
        toString();
        equals(this);
        hashCode();
        this.species = species;
    }

    //cannot be static or final
    public abstract void move();
}
