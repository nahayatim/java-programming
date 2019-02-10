package challenge.similaritiesinwords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimilaritiesTest {

    private Similarities similarities = new Similarities();

    @Test
    void areSimilar() {
        String word1 = "pale";
        String word2 = "ple";

        boolean result = similarities.areSimilar(word1, word2);
        assertTrue(result);
    }

    @Test
    void areSimilar2() {
        String word1 = "pale";
        String word2 = "pales";

        boolean result = similarities.areSimilar(word1, word2);
        assertTrue(result);
    }

    @Test
    void areSimilar3() {
        String word1 = "pale";
        String word2 = "bale";

        boolean result = similarities.areSimilar(word1, word2);
        assertTrue(result);
    }

    @Test
    void areSimilar3ButChanged() {
        String word2 = "pale";
        String word1 = "bale";

        boolean result = similarities.areSimilar(word1, word2);
        assertTrue(result);
    }

    @Test
    void areNoSimilar() {
        String word1 = "pale";
        String word2 = "bake";

        boolean result = similarities.areSimilar(word1, word2);
        assertFalse(result);
    }
}