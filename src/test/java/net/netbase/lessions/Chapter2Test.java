package net.netbase.lessions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Chapter2Test {
    @Test
    void learn() {
        Chapter2.learn();
        assertEquals(true, true);
    }

    @Test
    void testIsPrimeWithNegativeNumber() {
        assertEquals(false, Chapter2.isPrime(-1));
    }

    @Test
    void testIsPrimeWithZero() {
        assertEquals(false, Chapter2.isPrime(0));
    }

    @Test
    void testIsPrimeWithOne() {
        assertEquals(false, Chapter2.isPrime(1));
    }

    @Test
    void testIsPrimeWithTwo() {
        assertEquals(true, Chapter2.isPrime(2));
    }

    @Test
    void testIsPrimeWithNumberIsGreaterThan2AndIsEven() {
        assertEquals(false, Chapter2.isPrime(4));
    }

    @Test
    void testIsPrimeWithNumberIsGreaterThan2AndIsOddAndIsPrime() {
        assertEquals(true, Chapter2.isPrime(7));
    }

    @Test
    void testIsPrimeWithNumberIsGreaterThan2AndIsOddAndNotPrime() {
        assertEquals(false, Chapter2.isPrime(9));
    }

    @Test
    void testGetPrimeNumbersWithLengthIsZero() {
        ArrayList<Number> primeNumbers = Chapter2.getPrimeNumbers(0);
        assertEquals(primeNumbers.size(), 0);
    }

    @Test
    void testGetPrimeNumbersWithLengthIsOne() {
        ArrayList<Number> primeNumbers = Chapter2.getPrimeNumbers(1);
        assertEquals(primeNumbers.size(), 1);
        assertEquals(primeNumbers.get(0), 2);
    }

    @Test
    void testGetPrimeNumbersWithLengthIsTen() {
        ArrayList<Number> primeNumbers = Chapter2.getPrimeNumbers(10);
        int[] firstTenPrimeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertEquals(primeNumbers.size(), 10);
        boolean isValidPrimeNumbers = true;
        for (int i = 0; i < firstTenPrimeNumbers.length; i++) {
            if (firstTenPrimeNumbers[i] != (int) primeNumbers.get(i)) {
                isValidPrimeNumbers = false;
                break;
            }
        }
        assertEquals(isValidPrimeNumbers, true);
    }
}