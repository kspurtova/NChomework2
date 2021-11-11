package com.mycompany.charter2.exercise9;

public class Car {

    private double x = 0.0;
    private double fuel = 50.0;
    private final double FUEL_EFFICIENCY = 0.08;

    public Car() {
    }

    public void driveOn(double moveX) {
        if (moveX*FUEL_EFFICIENCY<=fuel) {
            this.x += moveX;
            this.fuel -= moveX*FUEL_EFFICIENCY;
            System.out.println("You  drive by a " +moveX + " miles");
        }
        else {
            System.out.println("You tried to drive by a " + moveX + " miles");
            System.out.println("But you don't have enough fuel");
            this.x += fuel/FUEL_EFFICIENCY;
            System.out.println("You  drive by a " + fuel/FUEL_EFFICIENCY + " miles");
            fuel = 0.0;
        }
    }

    public void addFuel (double newFuel) {
        this.fuel+=newFuel;
        System.out.println("You add a " + newFuel + " gallons to the gas tank");
    }


    public void getInfo() {
        System.out.println( "Current distance from the origin: " + x +
                ", fuel level: " + fuel);
    }

}
