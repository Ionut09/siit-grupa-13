package com.siit.collections.sets;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Employee extends Person {

    private int salary;

    @Builder
    private Employee(String name, String cnp, int age, int salary) {
        super(name, cnp, age);
        this.salary = salary;
    }

    //asta face Lombok
//    public String toString() {
//        return "Employee(" + super.toString() + ", salary=" + salary + ")";
//    }
}
