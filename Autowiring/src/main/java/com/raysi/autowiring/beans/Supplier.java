package com.raysi.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Supplier {
    private String supplierName;

    @Autowired
    private SupplierAddress address;

    public Supplier(){

    }

    public Supplier(String supplierName){
        this.supplierName = supplierName;
    }
    @Override
    public String toString(){
        return "\nSupplier Name: " + supplierName + "\nAddress: " + address;
    }
}