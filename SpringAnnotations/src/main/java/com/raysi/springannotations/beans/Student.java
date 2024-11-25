package com.raysi.springannotations.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int sid;
    private String name;
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

