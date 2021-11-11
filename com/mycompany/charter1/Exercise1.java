package com.mycompany.charter1;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        int var=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            var = scanner.nextInt();
            System.out.println(var);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        printTo(var,2);
        printTo(var,8);
        printTo(var, 16);

    }

    public static void printTo (int x, int degree) {
        String [] numbers = {"A", "B", "C", "D", "E", "F"};
        if ((degree == 2) || (degree == 8) || (degree == 16)) {
            String str = "";
            while (x > 0) {
                if (x%degree < 10) {
                    str += x % degree;
                }
                else {
                    str += numbers[(x%degree)%10];
                }
                x = (int) x / degree;
            }
            StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            System.out.println("result for " +degree + " = " + buffer);
        }
        else System.out.println("Введите систему счисления: 2, 8 или 16");
    }

}
