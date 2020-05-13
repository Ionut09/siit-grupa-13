package com.siit.enums;

import java.util.Arrays;
import java.util.Scanner;

import static com.siit.enums.Season.FALL;
import static com.siit.enums.Season.SPRING;
import static com.siit.enums.Season.SUMMER;
import static com.siit.enums.Season.WINTER;

public class MeteoService {

    public static void main(String... args) {
        System.out.println("Enter season name");
        String next = new Scanner(System.in).next();
        Season season = Season.valueOf(next.toUpperCase());

        switch (season) {
            case SUMMER:
                System.out.println("is hot: " + Season.SUMMER.getAverageTemperature() + " - ordinal: " + SUMMER.ordinal());
                break;
            case FALL:
                System.out.println("is chilly" + FALL.getAverageTemperature() + " - ordinal: " + FALL.ordinal());
                break;
            case WINTER:
                System.out.println("is cold" + WINTER.getAverageTemperature());
                break;
            case SPRING:
                System.out.println("is nice" + SPRING.getAverageTemperature());
                break;
        }

        switch (next) {
            case "SUMER":
        }

        Season[] values = Season.values(); //[SUMMER, FALL, WINTER, SPRING]
        Arrays.stream(values)
              .forEach(enumConstant -> System.out.println(enumConstant.name() + ":" + enumConstant.ordinal()));
    }
}
