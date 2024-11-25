package com.raysi.diusingconstructor.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private int houseNo;
    private String city;
    private String state;

    public Address (int houseNo, String city, String state){
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString(){
        return "HouseNo: " + houseNo + ", City: " + city + ", State: " + state;
    }
}
