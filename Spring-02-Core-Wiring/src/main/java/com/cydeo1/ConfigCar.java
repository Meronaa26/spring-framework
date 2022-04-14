package com.cydeo1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
//Direct wiring
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        return p;
//    }


    //AutoWiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Meron");
        p.setCar(car);
        return p;
    }

}
