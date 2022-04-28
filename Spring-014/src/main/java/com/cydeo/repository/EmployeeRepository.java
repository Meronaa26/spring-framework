package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee ,Long> {


      //display all employee with email address
       List<Employee>findByEmail(String email);

      // Display all employees with first name ' ' and lat name ' ' and also show all employees with email address
       List<Employee>findByFirstNameAndLastNameOrEmail(String firstName , String lastName , String email);

       //Display all employees that First name is not ' '
        List<Employee>findByFirstNameIsNot(String firstName);

        //Display all employees where last name starts with ' '
        List<Employee>findByLastNameStartingWith(String pattern);

        //Display all employees with salaries higher than ' '
        List<Employee>findBySalaryGreaterThan(Integer salary);

        List<Employee>findBySalaryLessThanEqual(Integer salary);


        //Display employees that has been hired between  '' and ''
        List<Employee>findByAndHireDateBetween(LocalDate startDate, LocalDate endDate);

        //display where salaries greater and equal
        List<Employee>findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

        List<Employee>findDistinctTop3BySalaryLessThan(Integer salary);


       List<Employee>findByEmailIsNull();



        @Query("SELECT e FROM Employee e WHERE e.email = 'sdubber7@t-online.de' ")
        Employee getEmployeeDetail();

        @Query("SELECT e.salary FROM Employee e WHERE e.email='sdubber7@t-online.de'")
        Integer getEmployeeSalary();

        @Query("SELECT e FROM Employee e WHERE e.email=?1")
        Optional<Employee> getEmployeeDetail(String email);

        @Query("Select e FROM Employee  e WHERE e.email=?1 AND e.salary=?2")
        Employee getEmployeeDetail(String email , int salary);


        //Not Equal
       @Query("SELECT e FROM Employee e WHERE e.salary<>?1")
       List<Employee>getEmployeeSalaryNotEqual(int salary);

       //Like/contains/startWith/endsWith
       @Query("SELECT e FROM Employee e WHERE e.firstName LIKE?1")
       List<Employee>getEmployeeFirstNameLike(String pattern );


       //less than
        @Query("SELECT e FROM Employee  e WHERE e.salary<?1")
        List<Employee>getEmployeeSalaryLessThan(int salary);

       //Greater  than
       @Query("SELECT e FROM Employee  e WHERE e.salary>?1")
       List<Employee>getEmployeeSalaryGreaterThan(int salary);


        //Before
       @Query("SELECT e FROM  Employee e WHERE e.hireDate>?1")
       List<Employee>getEmployeeHireDateBefore(LocalDate date);

       //between
       @Query("select e from Employee e where e.salary between ?1 and ?2")
       List<Employee>getEmployeeSalaryBetween(int salary, int salary2);

       //null
       @Query("select e from Employee  e where e.email IS NULL")
       List<Employee>getEmployeeEmailIsNull();

       //Notnull
       @Query("select e from Employee  e where e.email IS NOT NULL")
       List<Employee>getEmployeeEmailIsNotNull();

       //Sorting in ascending order
      @Query("select e from Employee e ORDER BY e.salary desc")
      List<Employee>getEmployeeSalaryOrderAsc();



}
