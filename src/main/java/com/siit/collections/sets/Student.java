package com.siit.collections.sets;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Student extends Person {

    private int scholarship;

    @Builder
    private Student(String name, String cnp, int age, int scholarship) {
        super(name, cnp, age);
        this.scholarship = scholarship;
    }
}
