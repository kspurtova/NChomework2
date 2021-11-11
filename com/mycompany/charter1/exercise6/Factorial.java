package com.mycompany.charter1.exercise6;

import java.math.BigInteger;

public class Factorial {

    BigInteger fact (BigInteger n) {


        if (n.equals(BigInteger.valueOf(1))) {
            return BigInteger.valueOf(1);
        }
        else {
            BigInteger result = fact(n.subtract(BigInteger.valueOf(1))).multiply(n);
            return result;
        }
    }
}
