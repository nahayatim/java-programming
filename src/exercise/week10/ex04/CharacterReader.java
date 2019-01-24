package exercise.week10.ex04;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {
    public List<Character> getCharacter() {
        return new FileReader().asStream("exercise/week10/ex04/got-characters.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(e -> new Character(
                        e[0],
                        e[1],
                        e[2],
                        e[3],
                        e[4],
                        e[5],
                        e[6],
                        e[7]
                ))
                .collect(Collectors.toList());
    }
}