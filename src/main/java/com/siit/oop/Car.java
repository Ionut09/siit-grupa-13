package com.siit.oop;

public class Car {
    public final static int MIRRORS = 3; //constanta
    private static String steeringWheel = "round";
    //fields, atribute, variabile de instanta, proprietati
    private String color;
    private int doorsNumber;
    private String fuel;
    private String model;
    private int power; //kW
    private int speed;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
        this("white", 5, 100, "petrol", 150, "berlina");
        setColor("Black");
    }

    public Car(String color,
               int doorsNumber,
               int power,
               String fuel,
               int speed,
               String model) {
        System.out.println("Constructor with arguments called");
        this.color = color;
        this.doorsNumber = doorsNumber;
        setPower(power); //pt a beneficia de validare
        this.fuel = fuel;
        this.speed = speed;
        this.model = model;
    }

    public Car(String color, int doorsNumber) {
        this(color, doorsNumber, 100, "petrol", 150, "berlina");
    }

    public Car(int power, String fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    public void Car() {
        System.out.println("Metoda amarata");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return this.power;
    }

    //getters and setters Java beans naming convention
    public void setPower(int power) {
        if (power > 0 && power < 2000) {
            this.power = power;
            System.out.println("power set to: " + power);
        } else {
            System.out.println("Bad value for power!");
            throw new IllegalArgumentException("Bad value for power!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
