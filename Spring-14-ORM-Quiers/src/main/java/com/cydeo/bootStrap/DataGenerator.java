package com.cydeo.bootStrap;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository,DepartmentRepository departmentRepository,EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
       this.departmentRepository = departmentRepository;
       this.employeeRepository=  employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("--------------REGION START ---------------");
        System.out.println("Find By Country" + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry" + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry" + regionRepository.findByCountryContainingOrderByCountry("United"));
        System.out.println("-------------REGION END-------------");



        System.out.println("--------------DEPARTMENT START ---------------");
        System.out.println(departmentRepository.findByDepartment("Toys"));
        System.out.println("findDistinctTop3ByDivisionContains" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("--------------DEPARTMENT END ---------------");


        System.out.println("--------------EMPLOYEE START ---------------");
        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println(employeeRepository.getEmployeeSalary());
    }
}
