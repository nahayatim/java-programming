package challenge.misspelledwords;

import org.junit.jupiter.api.Test;

import java.util.List;

class DictionaryFileReaderTest {

    @Test
    void getLine() {
        DictionaryFileReader dictionaryFileReader = new DictionaryFileReader();
        List<String> lines = dictionaryFileReader.getLine();
        for (String line : lines) {
            System.out.println(line);
        }

    }
}