package com.siit.jdbc.spring_data_jpa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pt auto increment
    private Integer id;

    @Column(name = "name")
    private String ename;

    private String job;

    @Column(name = "mgr")
    private Integer manager;

    private LocalDate hiredate;

    private Integer salary;

    private Integer comm;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "id")//se pune pe partea care detine relatia (foreign key-ul)
    private Department department; //null sau nu
}
