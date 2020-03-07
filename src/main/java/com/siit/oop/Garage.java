package com.siit.oop;

public class Garage {

    public static void main(String... args) {
        /*
        Car porsche = new Car(); //class = user-defined type
//        porsche --> referinta obiectului
        porsche.doors = 5;
        porsche.model = "Porsche Panamera";
        porsche.power = 250;
        System.out.println("porsche.doors = " + porsche.doors);
        System.out.println("porsche = " + porsche);
        System.out.println("porsche.power = " + porsche.power);

        Car volvo = new Car();
        volvo.model = "Volvo S60";
        volvo.power = 150;
        System.out.println("volvo.power = " + volvo.power);

        System.out.println("steeringWheel = " + Car.steeringWheel);
        //Warning Intellij zice: Static member
        // 'com.siit.oop.Car.steeringWheel' accessed via instance reference
        porsche.steeringWheel = "Hexagon";
        System.out.println("defaultCar steeringWheel = " + Car.steeringWheel);
        System.out.println("volvo steeringWheel = " + volvo.steeringWheel);

        Car duster = new Car();
        System.out.println("duster.steeringWheel = " + duster.steeringWheel);
        System.out.println("duster.MIRRORS = " + duster.MIRRORS);
//        duster.MIRRORS = 5;

        final int finalVariable = 2;
//        finalVariable =4;


        codul nu mai merge pt ca am fieldurile private
         */
        // porsche.power = -100;
        Car porsche = new Car();
        porsche.setModel("Porsche");
        porsche.setPower(300);
//        porsche.setPower(-300);
        int power = porsche.getPower();
/*
                String color,
               int doorsNumber,
               int power,
               String fuel,
               int speed,
               String model
 */
        Car tesla = new Car("red",
                5,
                200,
                "electric",
                200,
                "Tesla Model S");

        Car defaultCar = new Car();
        System.out.println("defaultCar color: " + defaultCar.getColor());
    }
}
