package com.siit.oop.builder;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{

    private int lowerSalary;

    PartTimeEmployee(int age, long cnp, Department department, String firstName, String lastName, Scanner sc) {
        super(age, cnp, department, firstName, lastName, sc);
    }
}
