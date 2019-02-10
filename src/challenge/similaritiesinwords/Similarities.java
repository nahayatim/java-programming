package challenge.similaritiesinwords;

import java.util.Stack;
import java.util.stream.Stream;

public class Similarities {

    public boolean areSimilar(String word1, String word2) {
        int difference = countDifferences(word1, word2);
        return difference < 2;
    }


    private int countDifferences(String word1, String word2) {
        Stack<String> letters1 = toLetters(word1);
        Stack<String> letters2 = toLetters(word2);
        int difference = 0;
        while (areThereMore(letters1, letters2)) {
            difference += compareFirstLetters(letters1, letters2);
        }
        return difference;
    }


    private Stack<String> toLetters(String word) {
        Stack<String> letters = new Stack<>();
        Stream.of(word.split(""))
                .forEach(letters::push);
        return letters;
    }

    private boolean areThereMore(Stack<String> letters1, Stack<String> letters2) {
        return !letters1.isEmpty() && !letters2.isEmpty();
    }


    private int compareFirstLetters(Stack<String> letters1, Stack<String> letters2) {
        String letter1 = letters1.pop();
        String letter2 = letters2.pop();
        if (letter1.equalsIgnoreCase(letter2)) {
            return 0;
        }
        restack(letter1, letters1, letters2);
        restack(letter2, letters1, letters2);
        return 1;
    }

    private void restack(String letter, Stack<String> letters, Stack<String> others) {
        if (others.isEmpty()) {
            return;
        }
        String other = others.peek();
        if (letter.equalsIgnoreCase(other)) {
            letters.push(letter);
        }
    }


}
