package com.github.iaroshenko.ievgen;


import java.math.BigInteger;

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a2 + b2 = c2
//        For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.
public class Problem9 {


    public static void main(String[] args) {
        for (int a = 1; a <= 333; a++) {
            for (int b = a + 1; b <= 500; b++) {
                double c = Math.sqrt(a*a + b*b);
                if (isInteger(c)) {
                    if (a + b + c == 1000) {
                        BigInteger result = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf((int)c));
                        System.out.println(result);
                    }
                }
            }
        }
    }

    private static boolean isInteger(double variable) {
        return (variable == Math.floor(variable)) && !Double.isInfinite(variable);
    }
}
