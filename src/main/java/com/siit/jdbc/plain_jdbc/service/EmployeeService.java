package com.siit.jdbc.plain_jdbc.service;

import com.siit.jdbc.plain_jdbc.domain.entity.Employee;
import com.siit.jdbc.plain_jdbc.repository.EmployeeRepository;
import com.siit.jdbc.plain_jdbc.repository.EmployeeRepositoryImpl;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    //logica de milioane de $$
    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(int empId) {
        employeeRepository.delete(empId);
    }

    public List<Employee> findByName(String employeeName) {
        return employeeRepository.findByName(employeeName);
    }

    public static void main(String... args) {
        EmployeeService employeeService = new EmployeeService(new EmployeeRepositoryImpl());

        Employee john_doe = Employee.builder()
                                    .id(10)
                                    .name("John Doe")
                                    .hiredate(LocalDate.of(2000, 10, 12))
                                    .salary(2000)
                                    .job("it-ist")
                                    .build();

        employeeService.create(john_doe);

        employeeService.findByName("John Doe")
                       .forEach(employee -> System.out.println("employee = " + employee +
                               "\n\t department = " + employee.getDepartment()));

        employeeService.delete(35);



    }
}
