package com.mycompany.charter1;

import java.util.Random;

public class Exercise13 {
    public static void main(String[] args) {

        int[] array = new int[49];
        for (int i=0; i<49; i++)
            array[i]=i+1;
        int count = 49;
        int next;
        int [] results = new int[6];

        Random generator = new Random();

        for (int i=0; i<6; i++) {
            next = generator.nextInt(count);
          //  System.out.println(array[next] + " ");
            results[i]=array[next];
            for (int j=next; j<count-1; j++)
                array[j]=array[j+1];
            count--;
        }

      //  System.out.println("count=" + count);

        // Сортировка вставками
        int j;
        int key;
        for (int i=0; i< results.length; i++) {
            j=i-1;
            key = results[i];
            while ((j>=0) && (results[j]>key)) {
                results[j+1]=results[j];
                j-=1;
            }
            results[j+1] = key;
        }

        for (int i=0; i<results.length; i++)
            System.out.println(results[i]);
    }
}
