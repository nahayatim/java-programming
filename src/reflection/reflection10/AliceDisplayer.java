package reflection.reflection10;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceDisplayer {

    private List<String>lines=new AliceReader().getLine();


    public void countAllWords(){
        long allWords = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .count();
        System.out.println("Number of words: "+allWords);

    }


    public void countDistinctWords(){
        long distinctWord = lines.stream()
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .distinct()
                .count();
        System.out.println("Number of distinct words: "+distinctWord);
    }

    
    public void findLongestWord(){
        Optional<Integer> longestWord = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(String::length)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .findFirst();
        System.out.println("Longest words: "+longestWord.get());
    }
    //Most appearing 5 words:
    //1816 | the
    //940 | and
    //805 | to
    //690 | a
    //628 | of

    public void findMostFiveAppearingWords(){
        lines.stream()
                .map(e->e.split(" "))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .collect(Collectors.toList());
    }

}












































