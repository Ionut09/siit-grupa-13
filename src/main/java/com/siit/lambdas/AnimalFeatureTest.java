package com.siit.lambdas;

import com.siit.oop.inheritance.Animal;

@FunctionalInterface
public interface AnimalFeatureTest {

    boolean testAnimal(Animal a);

    default void print() {
        System.out.println();
    }
}
