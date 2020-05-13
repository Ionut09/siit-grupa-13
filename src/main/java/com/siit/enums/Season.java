package com.siit.enums;

import java.io.Serializable;

public enum Season implements Serializable {//un enum nu poate extinde alta clasa

     FALL(10.2),
    WINTER(0),
    SPRING(15),
    SUMMER(35.5); //sunt ca niste constante

    private double averageTemperature;

    Season(double temp) {
        this.averageTemperature = temp;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}
