package com.cydeo.repository;

import com.cydeo.entity.Course;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department ,String> {

    //Display all department in the furniture department

    List<Department>findByDepartment(String division);

    List<Department>findByDivisionEquals(String division);

    List<Department>findByDivisionIs(String division);

    //Display top 3 department with division name includes 'Hea'

    List<Department>findDistinctTop3ByDivisionContains(String pattern);

    @Query("Select d from Department d where d.division IN ?1 ")
     List<Department>getDepartmentDivision(List<String> division);

    @Query(value= "select * from employee where salary?1",nativeQuery = true)
    List<Employee>readEmployeeDetailBySalary(int salary);

    @Query("select e from Employee e where e.salary= :salary")
    List<Employee>getEmployeeSalary(@Param("salary") int salary);

    @Query("select c from Course c where c.category=:category  AND  c.rating>:rating")
    List<Course>findAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating );
}
