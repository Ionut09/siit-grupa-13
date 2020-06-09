package com.siit.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {

     void save(Employee employee) throws SQLException;
    List<Employee> findByName(String name);


}
