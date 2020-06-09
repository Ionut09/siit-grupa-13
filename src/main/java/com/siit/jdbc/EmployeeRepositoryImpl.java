package com.siit.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void save(Employee employee) throws SQLException {

        PreparedStatement preparedStatement = getPreparedStatement("insert into employee( name, job, hiredate, salary, id) values (?, ?,?,?,?)");
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getJob());
        preparedStatement.setDate(3, Date.valueOf(employee.getHiredate()));
        preparedStatement.setInt(4, employee.getSalary());
        preparedStatement.setInt(5, employee.getId());
        int rowsAffected = 0;
        try {
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (rowsAffected > 0) {
            System.out.println("Employee " + employee + " was inserted successfuly");
        }


    }

    private PreparedStatement getPreparedStatement(String query) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr?serverTimezone=EET",
                    "root",
                    "password");
            return connection.prepareStatement(query);
        } catch (SQLException throwable) {
            System.out.println("Error while getting connection");
            throw new RuntimeException("Error while getting connection", throwable);
        }
    }

    @Override
    public List<Employee> findByName(String name) {
        return null;
    }


}
