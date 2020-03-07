package com.siit.oop;

public class Engine {
    private int displacement;
    private String type; //V, line


    public Engine(int displacement, String type) {
        this.displacement = displacement;
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
