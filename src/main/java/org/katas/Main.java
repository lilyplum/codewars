package org.katas;

import org.katas.sixkyu.isprime.IsNumberPrime;

public class Main {
    public static void main(String[] args) {
        IsNumberPrime isNumberPrime = new IsNumberPrime();
        boolean cond = isNumberPrime.isPrime(4);
        if (cond) System.out.println("true");
        else System.out.println("false");
    }
}