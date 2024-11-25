package com.raysi.springannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceAnnotation {
    @Value("116")
    private int sid;
    @Value("Aashish")
    private String name;
    @Value("8.88")
    private double marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println("SID: " + sid);
        System.out.println("NAME: " + name);
        System.out.println("MARKS: " + marks);
    }
}
