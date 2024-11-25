package com.raysi.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("Apre")
    private String name;
    @Value("Blue")
    private String color;
    @Autowired
    private Chessi chessi;
    @Autowired
    private Engine engine;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChessi(Chessi chessi) {
        this.chessi = chessi;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Chessi: " + chessi);
        System.out.println("Engine: " + engine);
    }
}
