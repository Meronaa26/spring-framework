package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository ;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1= new Car("BMW","M5");
        Car c2= new Car("TOYOTA","CHR");
        Car c3= new Car("HONDA","CIVIC");


        //save these objects  ==> to save the objects you should call the carRepository methods that is providing  that's whay we need to inject

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }
}
