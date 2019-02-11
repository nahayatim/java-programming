package challenge.ex9;

import exercise.week10.ex04.FileReader;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoryFileReader {
    public Set<String> getLine() {
        return new FileReader().asStream("challenge/ex9/book/alice's-adventures-in-wonderland.txt")
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
//                .map(e -> e.replaceAll("’s", " "))
//                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("!", " "))
                .map(e -> e.replaceAll("\\?", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.replaceAll("\\“", " "))
                .map(e -> e.replaceAll("\\”", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toSet());

    }
}
