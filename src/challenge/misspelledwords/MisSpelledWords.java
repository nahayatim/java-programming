package challenge.misspelledwords;

import java.util.List;
import java.util.Set;

public class MisSpelledWords {

    private DictionaryFileReader dictionaryFileReader = new DictionaryFileReader();
    private StoryFileReader storyFileReader = new StoryFileReader();
    private Gather gather = new Gather();

    public List<String> findMistake() {

        Set<String> storylines = storyFileReader.getLine();
        List<String> dictionaryLines = dictionaryFileReader.getLine();

        return gather.misSpelledWords(storylines, dictionaryLines);
    }
}
