package test.java.azubi.challenge.firstyear;

import org.junit.Test;

import main.java.azubi.challenge.firstyear.DigitPowers;

import main.java.azubi.challenge.firstyear.MultiDimensionalArrays;
import static org.junit.Assert.*;

public class MultiDimensionalArraysTest {

    @Test
    public void buildRandomMatrix_shouldHave_dimension() {
        int dimension = 3;
        int[][] actual = MultiDimensionalArrays.buildRandomMatrix(dimension);
        assertEquals(3, actual.length);
        assertEquals(3, actual[0].length);
    }

    @Test
    public void sumMatrices_shouldHave_correctlySummed() {
        int[][] m1 = new int[][] {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };

        int[][] m2 = new int[][] {
            {-1, 1, 1},
            {1, 1, -1},
            {1, -1, 1}
        };

        int[][] actual = MultiDimensionalArrays.sumMatrices(m1, m2);
        assertArrayEquals(new int[][] {
                {0, 3, 4},
                {3, 4, 0},
                {4, 0, 3}
            }, actual);
    }

    @Test
    public void buildMatrixHavingIncreasingColumnCounts_shouldBe_correct() {
        int[][] m = new int[][] {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        int[][] actual = MultiDimensionalArrays.buildMatrixHavingIncreasingColumnCounts(3);
        assertArrayEquals(m, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void buildSpiralSquare_shouldThrow_Exception_ifDimensionIsNotOdd() {
        MultiDimensionalArrays.buildSpiralSquare(2);
    }

    @Test
    public void buildSpiralSquare_shouldBe_correct() {
        int[][] m = new int[][] {
            {21, 22, 23, 24, 25},
            {20,  7,  8,  9, 10},
            {19,  6,  1,  2, 11},
            {18,  5,  4,  3, 12},
            {17, 16, 15, 14, 13}
        };

        int[][] actual = MultiDimensionalArrays.buildSpiralSquare(5);
        assertArrayEquals(m, actual);
    }
}