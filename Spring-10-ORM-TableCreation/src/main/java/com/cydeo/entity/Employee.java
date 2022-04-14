package com.cydeo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {  //  will be table name ==> employee
    @Id
    private int id;   //column name
    private String name;
}
