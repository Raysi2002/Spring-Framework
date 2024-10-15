package com.raysi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("116")
    private int id;
    @Value("Aashish")
    private String name;
    @Value("100000.0")
    private float salary;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.print("ID: " + id);
        System.out.print("\nNAME: " + name);
        System.out.print("\nSALARY: " + salary);
        }
}
