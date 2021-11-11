package com.mycompany.charter1;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        int[] arr = new int[3];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                System.out.println(arr[i]);
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }

        // Если в одну строчку, но в стиле Индии
        System.out.println("result with conditional operator = " + ((arr[0]<arr[1])? ( (arr[1]<arr[2]) ? arr[2] : arr[1]) : ( (arr[0]<arr[2]) ? arr[2] : arr[0])));

        // witn Math.max

        System.out.println("result with Math.max = " + Math.max( Math.max(arr[0],arr[1]), arr[2]) );

    }

}
