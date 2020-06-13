package com.siit.jdbc.spring_data_jpa;


import com.siit.jdbc.spring_data_jpa.entity.Employee;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public Employee save(Employee employee) {
        Employee savedEmployee = repository.save(employee);
        return savedEmployee;
    }

    public List<Employee> findAll(){
        return repository.findAllWithCustomQuery();
    }

    public List<Employee> findAllByName(String name){
        return repository.findAllByEname(name);
    }
}
