package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext( ConfigApp.class,ConfigAny.class);
        // we create container by the method spring framework provided us
        //we created the configuration classes
        //the container  is empty at this stage
        //then how do we add the beans ==> the configuration using the @Bean annotation and @steroTypeAnnotation

        FullTimeMentor ft= container.getBean(FullTimeMentor.class);
       ft.createAccount();

      String str= container.getBean(String.class);
        System.out.println(str);




    }
}
