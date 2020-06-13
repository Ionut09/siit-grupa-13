package com.siit.jdbc.plain_jdbc.repository;

import com.siit.jdbc.exception.MyUncheckedException;
import com.siit.jdbc.plain_jdbc.domain.entity.Department;
import com.siit.jdbc.plain_jdbc.domain.entity.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void save(Employee employee) {

        String query = "INSERT INTO employee( name, job, hiredate, salary, id) VALUES (?, ?, ?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);


        int rowsAffected = 0;
        try {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getJob());
            preparedStatement.setDate(3, Date.valueOf(employee.getHiredate()));
            preparedStatement.setInt(4, employee.getSalary());
            preparedStatement.setInt(5, employee.getId());
            rowsAffected = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Eror while inserting employee");
            throw new MyUncheckedException(e);
        }

        if (rowsAffected > 0) {
            System.out.println("Employee " + employee + " was inserted successfuly");
        }

        //fallback logic


    }

    @Override
    public List<Employee> findByName(String name) {
        String query = "select e.name as empName, e.id as empId , job, mgr, salary, comm,\n" +
                "       department_id, d.name as deptName, city\n" +
                "from employee e\n" +
                "         left join department d\n" +
                "              on e.department_id = d.id\n" +
                "where e.name = ?";

        PreparedStatement ps = getPreparedStatement(query);
        List<Employee> employees = new ArrayList<>();

        try {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery(); //o sa aiba 2 randuri

            while (rs.next()) {
                Employee employee = extractEmployeeFromResultSet(rs);
                employees.add(employee);
            }

        } catch (SQLException e) {
            System.out.println("Error while retrieving employees with name: " + name);
            throw new MyUncheckedException(e);
        }

        return employees;
    }

    private Employee extractEmployeeFromResultSet(ResultSet rs) throws SQLException {
        return Employee.builder()
                       .id(rs.getInt("empId"))
                       .name(rs.getString("empName"))
                       .job(rs.getString("job"))
                       .salary(rs.getInt("salary"))
                       .comm(rs.getInt("comm"))
                       .department(rs.getInt("department_id") == 0 ? null : Department.builder()
                                                                                      .id(rs.getInt("department_id"))
                                                                                      .name(rs.getString("deptName"))
                                                                                      .city(rs.getString("city"))
                                                                                      .build())
                       .build();
    }

    @Override
    public void update(Employee employee) {
        PreparedStatement preparedStatement = getPreparedStatement(
                "UPDATE employee SET " +
                        "name = ?, " +
                        "job = ?," +
                        "salary =?, " +
                        "mgr = ?," +
                        "hiredate =?, " +
                        "comm = ? " +
                        "WHERE id = ?");
        int rowsAffected = 0;

        try {
            preparedStatement.setInt(7, employee.getId());

            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Eror while updating employee");
            throw new MyUncheckedException(e);
        }

        if (rowsAffected > 0) {
            System.out.println("Employee with id " + employee.getId() + " was updated successfuly");
        }
    }

    @Override
    public void delete(int employeeId) {
        PreparedStatement preparedStatement = getPreparedStatement("DELETE FROM employee WHERE id = ?");
        int rowsAffected = 0;

        try {
            preparedStatement.setInt(1, employeeId);

            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Eror while deleting employee");
            throw new MyUncheckedException(e);
        }

        if (rowsAffected > 0) {
            System.out.println("Employee with id " + employeeId + " was deleted successfuly");
        }
    }


    public void deleteWithStatement(int employeeId) throws SQLException {
        String query = "delete from employee e where e.id ="; //
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr?serverTimezone=EET",
                "root",
                "password");
        Statement statement = connection.createStatement();
        statement.executeQuery(query + "7 OR 1=1"); // BAM SQL injection
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

}
