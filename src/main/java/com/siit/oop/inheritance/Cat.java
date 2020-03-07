package com.siit.oop.inheritance;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class Cat extends Animal {
    private List<Cat> cubs;
    private String name;

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat() {
        super("feline");
    }

    public void meew() {
        System.out.println("meeeow");
    }

    @Override
    public void move() {
        System.out.println("cat runs");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cat cat = (Cat) o;
//        return Objects.equals(name, cat.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
