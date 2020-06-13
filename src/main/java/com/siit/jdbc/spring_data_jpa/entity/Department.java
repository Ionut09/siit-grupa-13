package com.siit.jdbc.spring_data_jpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    private Integer id;

    private String name;

    private String city;

    @ToString.Exclude
    @OneToMany(mappedBy = "department")//mappedBy pe partea inversa a relatiei (care nu detine FK-ul) si
                                        // care are ca valoare numele fieldului din cealalta entitate
    private List<Employee> employees;
}
