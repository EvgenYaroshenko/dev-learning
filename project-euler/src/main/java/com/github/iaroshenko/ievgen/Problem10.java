package com.github.iaroshenko.ievgen;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//        Find the sum of all the primes below two million.
public class Problem10 {


    public static void main(String[] args) {
        System.out.println(getPrimesSummBelos(2000000));

    }

    private static BigInteger getPrimesSummBelos(int i) {
        List<Integer> primeList = new ArrayList<>();
        int counter = 2;
        while (counter <= i) {
            if (counter%1000 == 0) {
                System.out.println(counter);
            }
            boolean prime = true;
            int maximumPrime = (int) Math.floor(Math.sqrt(counter));
            for (Integer primeValue: primeList) {
                if (primeValue > maximumPrime) {
                    break;
                }
                if (counter % primeValue == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeList.add(counter);
            }
            counter++;
        }
        return primeList.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.valueOf(0L), BigInteger::add);
    }


}
