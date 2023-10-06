package org.courses.ex2_4;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 2020;
        this.speed = 210;
        this.weight = 1500;
        this.color = "White";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 210;
        this.weight = 1500;
        this.color = "White";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1500;
        this.color = "White";
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
        this.color = "White";
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

}
