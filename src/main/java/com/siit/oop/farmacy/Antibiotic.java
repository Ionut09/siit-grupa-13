package com.siit.oop.farmacy;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = true)
public class Antibiotic extends Medicine {

    public Antibiotic(String name) {
        super(name);
    }
}
