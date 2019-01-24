package exercise.week10.ex03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SmsSummarizerTest {

    private SmsReader reader = new SmsReader();
    private List<Sms> smsList = reader.getSms();

    @Test
    void hamAndSpamRatio() {
        String actual = smsList.stream()
                .collect(Collectors.groupingBy(Sms::getLabel, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / smsList.size() + "%")
                .collect(Collectors.joining(" "));

        String expected = "ham 86% spam 13%";
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void mostUsedHamWord() {

        Optional<String> first = smsList.stream()
                .filter(e -> e.getLabel().equals("ham"))
                .map(e -> e.getText())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        if (first.isPresent()) {
            first.get();
        }

        String expected = "to";
        Assertions.assertEquals(expected, first.get());
    }


    @Test
    void mostUsedHamLetter() {
        String mostUsedLetter = smsList.stream()
                .filter(e -> e.getLabel().equals("ham"))
                .map(e -> e.getText())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Most used ham letter: " + e.getKey() + " appears " + e.getValue() + " times")
                .limit(1)
                .collect(Collectors.joining(" "));


        String expected = "Most used ham letter: e appears 26364 times";
        Assertions.assertEquals(expected, mostUsedLetter);
    }


    @Test
    void longestSpamMessage() {
        Optional<Integer> longestSpamMessage = smsList.stream()
                .filter(e -> e.getLabel().equals("spam"))
                .map(Sms::getText)
                .map(String::length)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .findFirst();


        Integer expected = 224;
        Assertions.assertEquals(expected, longestSpamMessage.get());
    }


}