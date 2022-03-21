package com.cydeo.stereotype_annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan   // go to the packages and look for @Component and creat bean
                 // can look at only package
                 //@Component(basepackage)==> you can define packages in here if you like to go out of a package
public class ConfigCourse {




}
