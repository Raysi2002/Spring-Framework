package com.raysi.springjdbcmoduleretrive.controller;

import org.springframework.stereotype.Component;

@Component
public class Player {
    private int pid;
    private String name;
    private String type;
    private String rarity;
    private int power_level;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getPower_level() {
        return power_level;
    }

    public void setPower_level(int power_level) {
        this.power_level = power_level;
    }
}
