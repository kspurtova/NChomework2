package com.mycompany.charter2.exercise9;

public class Exercise9 {

    public static void main(String[] args) {
        Car car = new Car();
        car.getInfo();

        car.driveOn(10);
        car.getInfo();

        car.driveOn(650);
        car.getInfo();

        car.driveOn(10);
        car.getInfo();

        car.addFuel(50);
        car.getInfo();

    }
}


/* Should this be an immutable class?
Why or why not?

It's not immutable class because we always try to change the state of our object
 */
