package main.java.azubi.challenge.firstyear;

import java.util.*;

/**
 * Regarding multidimensional arrays ..
 * https://www.dummies.com/programming/java/java-use-arrays-with-two-dimensions-or-more/
 */
public class MultiDimensionalArrays {

    private static final Random random = new Random();

    public static void main(final String...args) {
        int[][] randomMatrix = buildRandomMatrix(5);
        printMatrix(randomMatrix);
    }

    /**
     * Returns a matrix initialized with random numbers.
     *
     * Example:
     *   dimension = 3
     *   42   27389      -74
     *   8376    -5   728397
     *   -727   634 28937293
     */
    public static int[][] buildRandomMatrix(final int dimension) {
        int randomNumber = random.nextInt();
        throw new UnsupportedOperationException("Implement me!");
    }

    /**
     * Sums two independent matrices.
     *
     * Example:
     *   Matrix 1:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Matrix 2:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Result:
     *   2  8 14
     *   4 10 16
     *   6 12 18
     */
    public static int[][] sumMatrices(int[][] m1, int[][] m2) {
        throw new UnsupportedOperationException("Implement me!");
    }

    /**
     * Returns a matrix initialized with increasing numbers column-wise.
     *
     * Example:
     *   dimension = 3
     *   1 4 7
     *   2 5 8
     *   3 6 9
     */
    public static int[][] buildMatrixHavingIncreasingColumnCounts(final int dimension) {
        throw new UnsupportedOperationException("Implement me!");
    }

    /**
     * Hard!
     *
     * Returns a matrix initialized with an increasing spiral clockwise.
     * The dimension must be odd (1, 3, 5, 7).
     *
     * @throws IllegalArgumentException when dimension is even (e.g. 2, 4, 6, 8).
     *
     * Example:
     *  21 22 23 24 25
     *  20  7  8  9 10
     *  19  6  1  2 11
     *  18  5  4  3 12
     *  17 16 15 14 13
     *
     */
    public static int[][] buildSpiralSquare(final int dimension) {
        throw new UnsupportedOperationException("Implement me!");
    }

    // --- utility methods, feel free to use

    public static void printMatrix(int[][] square) {
        final int maxNumber = square.length * square.length;
        final int maxDigits = Integer.toString(maxNumber).length();

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                final int number = square[row][col];
                final String paddedNumber = padLeftSpaces(number, maxDigits + 1);

                System.out.print(paddedNumber);
            }
            System.out.println();
        }
    }

    private static String padLeftSpaces(int input, int length) {
        final int inputLength = Integer.toString(input).length();
        if (inputLength > length) {
            return Integer.toString(input);
        }

        final StringBuilder sb = new StringBuilder();
        while (sb.length() < (length - inputLength)) {
            sb.append(' ');
        }
        sb.append(input);
        
        return sb.toString();
    }
}