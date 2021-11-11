package com.mycompany.charter3.exercise1;

import static com.mycompany.charter3.exercise1.Measurable.average;
import static com.mycompany.charter3.exercise1.Measurable.largest;

public class Exercise1 {

    public static void main(String[] args) {

        Measurable[] employees = new Employee[3];
        employees[0] = new Employee(20, "Ivan", 20);
        employees[1] = new Employee(60, "Mary", 25);
        employees[2] = new Employee(40, "Anna", 40);

        System.out.println("average = " + average(employees));

        Measurable emp = new Employee(30);
        System.out.println("mes = " + emp.getMeasure());

        System.out.println("The name of the employee with\n" +
                "the largest salary: " + ( (Employee)( largest(employees) ) ).getName());
    }
}

// We need to do cast because we can't resolve method 'getName' in 'Measurable'
// Method 'getName' provided in Employee, not in Measurable