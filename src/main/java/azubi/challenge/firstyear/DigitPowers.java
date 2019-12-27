package main.java.azubi.challenge.firstyear;

import java.util.*;

public class DigitPowers {

    public static void main(final String...args) {
        final long[] numbers = DigitPowers.findNumbers(5);

        for (final long number : numbers) {
            System.out.println(number);
        }
    }

    /**
     * Surprisingly there are only three numbers that
     * can be written as the sum of fourth powers of their digits:
     * 
     * 1634 = 1^4 + 6^4 + 3^4 + 4^4
     * 8208 = 8^4 + 2^4 + 0^4 + 8^4
     * 9474 = 9^4 + 4^4 + 7^4 + 4^4
     * 
     * As 1 = 1^4 is not a sum it is not included!
     * 
     * Find all numbers that can be written as the sum of fifth (5) powers of their digits.
     */
    public static long[] findNumbers(int power) {
        throw new UnsupportedOperationException("Implement me!");
    }

    public static long[] appendToArray(long[] array, long newLong) {
        long[] copy = Arrays.copyOf(array, array.length + 1);
        copy[copy.length - 1] = newLong;
        return copy;
    }
}