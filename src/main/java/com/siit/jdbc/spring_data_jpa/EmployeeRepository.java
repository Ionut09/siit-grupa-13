package com.siit.jdbc.spring_data_jpa;


import com.siit.jdbc.spring_data_jpa.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e " + //alias is mandatory
            "LEFT JOIN FETCH e.department " +
            "WHERE e.ename = :ename ")
    List<Employee> findAllByEname(@Param("ename") String ename);

    //JPQL
    @Query(value = "SELECT e FROM Employee e LEFT JOIN FETCH e.department")//, nativeQuery = true)
    List<Employee> findAllWithCustomQuery();

    //define methods in Spring Data JPA
    List<Employee> findAllByEnameAndAndHiredateAfter(String ename, LocalDate beginHireDate);
}
