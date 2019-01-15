package exercise.week09.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    private List<String> names = new FileReader().asList("exercise/week09/ex02/names.txt");


    @Test
    void testShortName() {
        List<String> shorterName = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");

        Assertions.assertEquals(expected, shorterName);


    }

    @Test
    void testNameEndWithM() {
        List<String> nameEndWithM = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());


        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, nameEndWithM);
    }


    @Test
    void testNameContainEandR() {
        List<String> nameContainER = names.stream()
                .filter(e -> e.contains("e"))
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, nameContainER);

    }

    @Test
    void testNameFourChar() {
        List<String> testNameWithFourLetter = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a"))
                .filter(e -> e.contains("m"))
                .map(e -> e.replace("a", "aa"))
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");

        Assertions.assertEquals(expected, testNameWithFourLetter);
    }


}
