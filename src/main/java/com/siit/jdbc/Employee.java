package com.siit.jdbc;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Employee {

    private int id;

    private String name;

    private String job;

    private int mgr;

    private LocalDate hiredate;

    private Integer salary;

    private Integer comm;

//    private Department department;
}
