package azubi.challenges.task007;

import org.junit.Test;

import azubi.challenges.task007.DigitPowers;

import static org.junit.Assert.*; 

public class DigitPowersTest {

    @Test
    public void findNumbers_shouldReturn_examples_givenExponent_4() {
        long[] actual = DigitPowers.findNumbers(4);
        assertArrayEquals(new long[] { 1634, 8208, 9474 }, actual);
    }

    @Test
    public void appendToArray_should_copyAndAppend() {
        long[] original = new long[] { 1, 2, 3 };
        long[] copy = DigitPowers.appendToArray(original, 4);

        assertEquals(4, copy[3]);
    }

    @Test
    public void appendToArray_shouldNot_modifyExistingArray() {
        long[] original = new long[] { 1, 2, 3 };
        long[] copy = DigitPowers.appendToArray(original, 4);

        assertEquals(3, original.length);
        assertEquals(4, copy.length);
    }
}