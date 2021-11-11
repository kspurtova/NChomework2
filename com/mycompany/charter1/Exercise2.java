package com.mycompany.charter1;

import java.util.Scanner;
import java.lang.Math;


public class Exercise2 {
    public static void main(String[] args) {

        int angle=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целочисленный угол: ");
        if (scanner.hasNextInt()) {
            angle = scanner.nextInt();
            System.out.println(angle);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        // Normalize with %
        int angle1 = ((angle%360) + 360) %360;

        System.out.println("Normalized value with % = " + angle1);

        // Normalize with floorMod

        int angle2 = Math.floorMod(angle,360);

        System.out.println("Normalized value with floorMod- = " + angle2);
    }
}
