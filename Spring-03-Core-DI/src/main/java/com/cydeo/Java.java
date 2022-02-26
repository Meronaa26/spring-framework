package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class Java {

    //Field injection
//    @Autowired
//    OfficeHours officehours ;


    //Constructor injection
    OfficeHours officehours ;
//    @Autowired
//    public Java(OfficeHours officehours){
//        this.officehours =officehours;
//    }
    public void getTeachingHours(){
        System.out.println("Weekly Teaching hours : " + (20 + officehours.getHours()));
    }
}
