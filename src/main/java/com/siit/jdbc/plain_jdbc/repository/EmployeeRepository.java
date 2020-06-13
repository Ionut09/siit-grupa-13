package com.siit.jdbc.plain_jdbc.repository;

import com.siit.jdbc.plain_jdbc.domain.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    void save(Employee employee);

    List<Employee> findByName(String name);

    void update(Employee employee);

    void delete(int employeeId);

}
