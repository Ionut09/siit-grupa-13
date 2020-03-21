package com.siit.oop.builder;

public class ObjectFactory {

    public static void main(String... args) {
        Employee emp = Employee.builder()
                               .age(40)
                               .firstName("John")
                               .lastName("Doe")
                               .cnp(18527238736823L)
                               .department(Department.builder()
                                                     .name("IT")
                                                     .build())
                               .build();

//        Employee emp1 = new Employee();
    }
}
