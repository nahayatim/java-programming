package challenge.ex9;

import org.junit.jupiter.api.Test;

import java.util.Set;

class StoryFileReaderTest {

    @Test
    void getLine() {
        StoryFileReader storyFileReader = new StoryFileReader();
        Set<String> lines = storyFileReader.getLine();
        for (String line : lines) {
            System.out.println(line);
        }
    }
}