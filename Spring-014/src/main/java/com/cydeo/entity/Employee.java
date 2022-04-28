package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@Table(name="employees")
@NoArgsConstructor
public class Employee  extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;

    @ManyToOne
    @JoinColumn(name="department")
    private Department department;

    @ManyToOne
    private Region region;



}
