package com.siit.oop.farmacy;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Suplement {

    private int dose;

    private String name;

//    @Override
//    public String toString() {
//        return getClass().getSimpleName();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
