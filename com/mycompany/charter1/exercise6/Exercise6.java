package com.mycompany.charter1.exercise6;

import java.math.BigInteger;

public class Exercise6 {

    public static void main(String[] args) {

        Factorial f = new Factorial();
        BigInteger var = BigInteger.valueOf(1000);
        BigInteger result = f.fact(var);
        System.out.println("result = " + result);
    }
}

