package com.mycompany.charter3.exercise1;

public class Employee implements Measurable{

    private double salary;
    private String name;
    private int age;

    public Employee(double salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }



}
