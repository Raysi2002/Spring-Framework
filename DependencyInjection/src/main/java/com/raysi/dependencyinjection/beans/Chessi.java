package com.raysi.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chessi {
    @Value("240818")
    private int chessiNo;
    @Value("Raysi Corp.")
    private String manufacture;

    public void setChessiNo(int chessiNo) {
        this.chessiNo = chessiNo;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    @Override
    public String toString() {
        return "ChessiNo: " + chessiNo + ", Manufacture: " + manufacture;
    }
}
