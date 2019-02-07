package challenge.permutationOfPalindrom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckPermutationTest {
    private CheckPermutation permutation = new CheckPermutation();


    @Test
    void isPalindromeWithoutSpace() {
        Boolean actual = permutation.isPermutation("nan");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpace() {
        Boolean actual = permutation.isPermutation("Tact Coa");
        assertTrue(actual);
    }

    @Test
    void isPalindromeWithSpaces() {
        Boolean actual = permutation.isPermutation("never odd or even");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation1() {
        Boolean actual = permutation.isPermutation("taco cat");
        assertTrue(actual);
    }

    @Test
    void isPalindromePermutation2() {
        Boolean actual = permutation.isPermutation("atco cta");
        assertTrue(actual);
    }

    @Test
    void notPolindrome() {
        Boolean actual = permutation.isPermutation("I am mahtab");
        assertFalse(actual);
    }

    @Test
    void notPolindrome2() {
        Boolean actual = permutation.isPermutation("ASHKAN mahtab Khajag DIBA");
        assertFalse(actual);
    }
}
