package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface CarRepository extends JpaRepository<Car,Long> {


    // you can add any custom methods if what is provided is not enough
    //sql
}
