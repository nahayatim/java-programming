package exercise.week08.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegant(String sentence) {
        return filter(sentence, e -> e.startsWith("ele"));
    }

    public List<String> findPlayful(String sentence) {
        return filter(sentence, e -> e.endsWith("ful"));
    }

    private List<String> filter(String sentence, Predicate<String> condition) {
        String[] Words = sentence.split(" ");
        List<String> filteredWord = new ArrayList<>();
        for (String word : Words) {
            if (condition.test(word)) {
                filteredWord.add(word);
            }
        }
        return filteredWord;
    }

}
