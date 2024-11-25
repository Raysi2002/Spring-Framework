package com.raysi.diusingconstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Aashish")
    private String name;
    @Value("116")
    private int sid;
    @Autowired
    private Address address;
    @Value("8.88")
    private double cgpa;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("SID: " + sid);
        System.out.println("Address: " + address);
    }
}