package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department  extends BaseEntity{

    private String department;
    private String division ;

    @OneToOne(mappedBy = "department")   //hibernate is not going to create foreign key, still it is owned by employee table
                                         //it will create a relationship with employee table department field
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
