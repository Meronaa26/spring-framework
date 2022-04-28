package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="courses")
public class Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name="NAME")
    private String name;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="RATING")
    private Long rating;
    @Column(name="DESCRIPTION")
    private String description;

}
