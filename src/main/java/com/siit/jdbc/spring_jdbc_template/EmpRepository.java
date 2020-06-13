package com.siit.jdbc.spring_jdbc_template;

import com.siit.jdbc.exception.MyUncheckedException;
import com.siit.jdbc.plain_jdbc.domain.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class EmpRepository  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    public void save(Employee employee) {
        int updatedRows = jdbcTemplate.update("INSERT INTO employee( name, job, hiredate, salary, id) VALUES (?, ?, ?,?,?)",
                employee.getName(),
                employee.getJob(),
                employee.getHiredate(),
                employee.getSalary(),
                employee.getId());

        if (updatedRows == 1) {
            System.out.println("Employee " + employee + " was inserted successfuly");
        }
    }

    
    public List<Employee> findByName(String name) {
        return null;
    }

    public List<Employee> findById(int id) {
        String query = "select * " +
                "from employee e\n" +
                "where e.id = ?";

        return jdbcTemplate.query(query, getEmployeeRowMapper(), id);
    }

    private RowMapper<Employee> getEmployeeRowMapper() {
        return (rs, rowNum) -> Employee.builder()
                               .id(rs.getInt("id"))
                               .name(rs.getString("name"))
                               .job(rs.getString("job"))
                               .salary(rs.getInt("salary"))
                               .comm(rs.getInt("comm"))
                               .build();
        /*
        fara lambda
         new RowMapper<>() {
            
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                return Employee.builder()
                               .id(rs.getInt("id"))
                               .name(rs.getString("name"))
                               .job(rs.getString("job"))
                               .salary(rs.getInt("salary"))
                               .comm(rs.getInt("comm"))
                               .build();
            }
        };
         */
    }

    
    public void update(Employee employee) {


    }

    
    public void delete(int employeeId) {
        String deleteStatement = "DELETE FROM employee WHERE id = ?";
        int deletedRows = jdbcTemplate.update(deleteStatement, employeeId);

        if (deletedRows == 1) {
            System.out.println("Employee with id: " + employeeId + " was deleted successfuly");
        } else {
            throw new MyUncheckedException("Error you should specify an unique column for delete queries");
        }
    }
}
