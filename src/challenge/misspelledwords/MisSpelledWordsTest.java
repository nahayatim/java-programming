package challenge.ex9;

import org.junit.jupiter.api.Test;

import java.util.List;

class MisSpelledWordsTest {

    private MisSpelledWords misSpelledWords = new MisSpelledWords();

    @Test
    void findMistake() {
        List<String> mistake = misSpelledWords.findMistake();
        System.out.println("size: " + mistake.size());
        mistake.forEach(System.out::println);
    }
}