package com.raysi.dependencyinjection;


import com.raysi.dependencyinjection.beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        var applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
        Car car = applicationContext.getBean(Car.class);
        car.display();
    }

}
