package test.java.azubi.challenge.firstyear;

import org.junit.Test;
import static org.junit.Assert.*; 

import main.java.azubi.challenge.firstyear.PermutationTester;

public class PermutationTesterTest {

    @Test
    public void emptyStrings_should_be_permutation_of_eachother() {
        boolean actual = PermutationTester.isPermutationOfOther("", "");
        assertTrue(actual);
    }

    @Test
    public void forward_and_backwards_should_be_permutation_of_eachother() {
        boolean actual = PermutationTester.isPermutationOfOther("abcde", "edcba");
        assertTrue(actual);
    }

    @Test
    public void chars_comparedto_numbers_should_not_permutation_of_eachother() {
        boolean actual = PermutationTester.isPermutationOfOther("abcde", "1234");
        assertFalse(actual);
    }

    @Test
    public void permutations_should_be_permutation_of_eachother() {
        boolean actual = PermutationTester.isPermutationOfOther("abcde", "cabde");
        assertTrue(actual);
    }
}