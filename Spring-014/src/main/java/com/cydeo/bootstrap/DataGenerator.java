package com.cydeo.bootstrap;

import com.cydeo.repository.CoursesRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CoursesRepository coursesRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CoursesRepository coursesRepository) {
        this.regionRepository = regionRepository;
       this.departmentRepository=  departmentRepository;
       this.employeeRepository=employeeRepository;
       this.coursesRepository =coursesRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("--------------REGION START ---------------");

        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));
        System.out.println("regionRepository.findByCountryContainingOrderByCountry(\"United\") = " + regionRepository.findByCountryContainingOrderByCountry("United"));
        System.out.println("regionRepository.findFirst2ByCountry(\"United\") = " + regionRepository.findFirst2ByCountry("Canada"));


        System.out.println("-------------REGION END-------------");

        System.out.println("--------------DEPARTMENT START ---------------");


        System.out.println("departmentRepository.findByDepartment(\"Toys\") = " + departmentRepository.findByDepartment("Toys"));
        System.out.println("departmentRepository.findByDivisionEquals(\"Electronics\") = " + departmentRepository.findByDivisionEquals("Home"));
        System.out.println("departmentRepository.findByDivisionIs(\"Outdoors\") = " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("departmentRepository.findDistinctTop3ByDivisionContains(\"%s\") = " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));


        System.out.println("-------------DEPARTMENT  END-------------");


        System.out.println("--------------EMPLOYEE START ---------------");

        System.out.println("employeeRepository.findByEmail(\"rcrace7b@cornell.edu\") = " + employeeRepository.findByEmail("rcrace7b@cornell.edu"));
        System.out.println("employeeRepository.findByFirstNameAndLastNameOrEmail(\"Arabelle\",\"Arch\",\"aarch77@marriott.com\") = " + employeeRepository.findByFirstNameAndLastNameOrEmail("Arabelle", "Arch", "aarch77@marriott.com"));
      //  System.out.println("employeeRepository.findByFirstNameIsNot(\"Shae\") = " + employeeRepository.findByFirstNameIsNot("Shae"));   a lot of data in here
        System.out.println("employeeRepository.findByLastNameStartingWith(\"R\") = " + employeeRepository.findByLastNameStartingWith("R"));
        System.out.println("employeeRepository.findBySalaryGreaterThan(\"101441\") = " + employeeRepository.findBySalaryGreaterThan(101441));
        System.out.println("employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalaryDesc(158810) = " + employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalaryDesc(158810));
      //  System.out.println("employeeRepository.findByAndHireDateBetween(\"2010-03-09\",\"2013-08-12\") = " + employeeRepository.findByAndHireDateBetween(2010-03-01, 2013-01-12));   I don't know how to call the DATE type
        System.out.println("employeeRepository.findByEmailIsNull() = " + employeeRepository.findByEmailIsNull());


        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());
        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());

        System.out.println("employeeRepository.getEmployeeDetail(\"jbruckcz@jalbum.net\") = " + employeeRepository.getEmployeeDetail("jbruckcz@jalbum.net"));
        System.out.println("employeeRepository.getEmployeeDetail(\"dbannesterdv@hibu.com\",94635) = " + employeeRepository.getEmployeeDetail("dbannesterdv@hibu.com", 94635));

        System.out.println("--------------EMPLOYEE END ---------------");


        System.out.println("--------------COURSES START ---------------");

        coursesRepository.findByCategory("Spring").forEach(System.out::println);
        coursesRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("coursesRepository.existsByName(\"JavaScript\") = " + coursesRepository.existsByName("JavaScript"));
        System.out.println("coursesRepository.countByCategory(\"Spring\") = " + coursesRepository.countByCategory("Spring"));
        System.out.println("coursesRepository.findByNameStartsWith(\"Scalable\") = " + coursesRepository.findByNameStartsWith("Scalable"));
    //    coursesRepository.streamByCategory("Spring").forEach(System.out::println);


        System.out.println("--------------COURSES  END ---------------");
    }
}
