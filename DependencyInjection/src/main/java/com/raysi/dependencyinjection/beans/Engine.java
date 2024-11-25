package com.raysi.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Value("116")
    private int engineId;
    @Value("V8")
    private String engineModel;
    @Value("250")
    private int power;

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "EngineId: " + engineId + ", EngineModel: " + engineModel + ", Power: " + power;
    }
}
