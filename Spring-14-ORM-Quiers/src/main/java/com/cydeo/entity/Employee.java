package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="employees")
public class Employee extends  BaseEntity{

    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    private Long salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department")
    private  Department departmentList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="region_id")
    private Region regionList ;

}
