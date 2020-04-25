package com.siit.collections.sets;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Unemployed extends Person {

    private int welfare; //somaj

    @Builder
    private Unemployed(String name, String cnp, int age, int welfare) {
        super(name, cnp, age);
        this.welfare = welfare;
    }
}
