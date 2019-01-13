package exercise.week08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdas {
    public static void main(String[] args) {
        List<String>words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);

        //remove every word that ends with the letter e.
        words.removeIf(word->word.endsWith("e"));
        System.out.println(words);

        //transform every word in their uppercase version
        words.replaceAll(word->word.toUpperCase());
        System.out.println(words);

        //remove every word that has less than six letters.
        words.removeIf(word->word.length()<6);
        System.out.println(words);

        // print every word one by one.
        words.forEach(word-> System.out.println(word));

    }

}
