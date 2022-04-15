package com.cydeo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {  //  will be table name ==> employee
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   //column name
    private String name;
}
