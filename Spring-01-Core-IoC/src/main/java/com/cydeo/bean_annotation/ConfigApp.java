package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //the use of theis annotation is, when you start the app it will find all the class with this kind of annotation and run those
//this class should be defined first
// add to this class a method that returns the object instance that you want to add to the
public class ConfigApp {

    @Bean // show the spring what type of bean have to be created
    FullTimeMentor fullTimeMentor(){

        return new FullTimeMentor();
    }

    @Bean(name ="p1")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean(name ="p2")
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }
}
