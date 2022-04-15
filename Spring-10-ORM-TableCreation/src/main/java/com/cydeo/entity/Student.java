package com.cydeo.entity;


import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="studentFirstName")
    private String firstName;  // will be created like first_name

    @Column(name="studentLastName")
    private String lastName;
    private String email;


    @Transient
    private String city;


    @Column(columnDefinition = "Date")
    private LocalDate birthdate;

    @Column(columnDefinition = "TIME")
    private LocalDate birthtime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthdateTime;


@Enumerated(EnumType.STRING)
    private Gender gender;
}
