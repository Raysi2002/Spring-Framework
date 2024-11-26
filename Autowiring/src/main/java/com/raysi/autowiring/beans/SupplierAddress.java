package com.raysi.autowiring.beans;

import org.springframework.stereotype.Component;


public class SupplierAddress {
    private String city;
    private String state;
    private String country;

    public SupplierAddress(){

    }

    public SupplierAddress(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
    @Override
    public String toString(){
        return "City: " + city + ", State: " + state + ", Country: " + country;
    }

}
