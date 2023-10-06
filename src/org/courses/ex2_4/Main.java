package org.courses.ex2_4;

public class Main {

    public static void main(String[] args) {

        int year = 2023;
        double speed = 240;
        int weight = 1000;
        String color = "Grey";

        Car car1 = new Car();
        Car car2 = new Car(year);
        Car car3 = new Car(year, speed);
        Car car4 = new Car(year, speed, weight);
        Car car5 = new Car(year, speed, weight, color);

        System.out.println(car1.getYear() + " " + " " + car1.getSpeed() + " " +
                car1.getWeight() + " " + car1.getColor());

        System.out.println(car2.getYear() + " " + " " + car2.getSpeed() + " " +
                car2.getWeight() + " " + car2.getColor());

        System.out.println(car3.getYear() + " " + " " + car3.getSpeed() + " " +
                car3.getWeight() + " " + car3.getColor());

        System.out.println(car4.getYear() + " " + " " + car4.getSpeed() + " " +
                car4.getWeight() + " " + car4.getColor());

        System.out.println(car5.getYear() + " " + " " + car5.getSpeed() + " " +
                car5.getWeight() + " " + car5.getColor());
    }
}

