package exercise.week09.ex03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(s -> encrypt(s, key))
                .collect(Collectors.joining());
    }


    private String encrypt(String letter, Integer key) {


        if (!Character.isAlphabetic(letter.charAt(0))) {
            return letter;
        }


        Character valueOfLetter = letter.charAt(0);
        int val;
        if (Character.isUpperCase(valueOfLetter)) {
            val = (valueOfLetter - 65 + key) % 26 + 65;

        } else {
            val = (valueOfLetter - 97 + key) % 26 + 97;

        }
        return Character.valueOf((char) val).toString();

    }
}
