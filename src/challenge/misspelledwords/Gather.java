package challenge.misspelledwords;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Gather {

    public List<String> misSpelledWords(Set<String> storyLines, List<String> dictionaryLines) {

        return storyLines.stream()
                .filter(e -> !dictionaryLines.contains(e))
                .collect(Collectors.toList());
    }
}
