package com.mycompany.charter3.exercise1;

public interface Measurable {


    double getMeasure();

    static double average(Measurable[] objects) {
        int count = 0;
        double sum = 0;
        while (count<objects.length) {
            sum+=objects[count].getMeasure();
            count++;
        }
        return (count == 0 ? 0 : sum/count);
    }

    static Measurable largest(Measurable[] objects) {
        Measurable max = objects[0];

        for (int i=1; i< objects.length; i++) {
            if (objects[i].getMeasure()>max.getMeasure()) max = objects[i];
        }

        return max;
    }
}
