package challenge.misspelledwords;

import exercise.week10.ex04.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class DictionaryFileReader {
    public List<String> getLine() {
        return new FileReader().asStream("challenge/misspelledwords/word/words.txt")
                .map(String::toLowerCase)
                .collect(Collectors.toList());

    }
}
