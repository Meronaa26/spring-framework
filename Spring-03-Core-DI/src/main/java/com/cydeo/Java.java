package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class Java {

    //Field injection
//    @Autowired  not recommended at field
//    OfficeHours officehours ;


    //Constructor injection
    OfficeHours officehours ;    // if only we have one constructor we don't need to say @Autoweird
//    @Autowired
//    public Java(OfficeHours officehours){   //uncommented because lambook does it (@AllArgconstructor)
//        this.officehours =officehours;
//    }
    public void getTeachingHours(){
        System.out.println("Weekly Teaching hours : " + (20 + officehours.getHours()));
    }
}
