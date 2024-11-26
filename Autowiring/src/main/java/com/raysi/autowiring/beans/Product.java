package com.raysi.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int pid;
    private String productName;
    @Autowired
    private Supplier supplier;
    private double sellingPrice;
    private int quanity;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void display(){
        System.out.println("PID: " + pid);
        System.out.println("Product Name: " + productName);
        System.out.println("Supplier: " + supplier);
        System.out.println("Selling Price: $" + sellingPrice);
        System.out.println("Quantity: " + quanity);
        System.out.println("Total Bill: $" + sellingPrice * quanity);
    }
}
