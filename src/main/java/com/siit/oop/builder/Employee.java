package com.siit.oop.builder;

import com.siit.annotations.OurAnnotation;

import java.util.Scanner;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@OurAnnotation
public class Employee {

    private int age;

    private long cnp;

    private Department department;

    private String firstName;

    private String lastName;

    private Scanner sc = new Scanner(System.in);

    public void setDepartment() {
        System.out.println("Please enter name: ");
        this.firstName = sc.next();
    }
}
