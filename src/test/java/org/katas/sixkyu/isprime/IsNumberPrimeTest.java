package org.katas.sixkyu.isprime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsNumberPrimeTest {

    private final IsNumberPrime isNumberPrime = new IsNumberPrime();

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "3, true",
            "5, true",
            "7, true",
            "11, true",
            "13, true",
            "17, true",
            "19, true",
            "23, true",
            "29, true",
            "1, false",
            "4, false",
            "6, false",
            "8, false",
            "9, false",
            "10, false",
            "997, true",
            "991, true",
            "983, true",
            "977, true",
            "971, true",
            "1000, false",
            "1001, false",
            "999, false",
            "990, false",
            "980, false"
    })
    void isPrime(int number, boolean expected) {
        boolean result = isNumberPrime.isPrime(number);
        assertEquals(expected, result);
    }
}