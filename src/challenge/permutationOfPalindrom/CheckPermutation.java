package challenge.permutationOfPalindrom;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckPermutation {

    public Boolean isPermutation(String word) {
        List<Long> lettersrepetition = getLettersRepetition(word);
        return lettersrepetition.size() <= 1;
    }


    public List<Long> getLettersRepetition(String word) {
        return Stream.of(word)
                .map(e -> e.replaceAll(" ", ""))
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .map(e -> e.toLowerCase())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e % 2 != 0)
                .filter(e -> e == 1)
                .collect(Collectors.toList());
    }

}