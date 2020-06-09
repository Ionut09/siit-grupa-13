package com.siit.jdbc;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public void create(Employee employee) throws SQLException {
        employeeRepository.save(employee);
    }

    public static void main(String... args) throws SQLException {
        EmployeeService employeeService = new EmployeeService(new EmployeeRepositoryImpl());
        employeeService.create(Employee.builder()
                                       .id(new Random().nextInt(1000))
                                       .name("John Doe")
                                       .hiredate(LocalDate.of(2000, 10, 12))
                                       .salary(2000)
                                       .job("it-ist")
                                       .build());
    }
}
