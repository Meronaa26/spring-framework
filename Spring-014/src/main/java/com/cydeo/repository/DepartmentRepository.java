package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department ,String> {

    //Display all department in the furniture department

    List<Department>findByDepartment(String division);

    List<Department>findByDivisionEquals(String division);

    List<Department>findByDivisionIs(String division);

    //Display top 3 department with division name includes 'Hea'

    List<Department>findDistinctTop3ByDivisionContains(String pattern);
}
