package com.siit.jdbc.plain_jdbc.domain.entity;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
public class Department {

    private String name;

    private String city;

    private int id;

    @ToString.Exclude
    private List<Employee> employee;
}
