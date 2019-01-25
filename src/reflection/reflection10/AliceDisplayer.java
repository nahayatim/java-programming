package reflection.reflection10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceDisplayer {

    private List<String>lines=new AliceReader().getLine();


    public void countAllWords(){
        long allWords = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e->!e.isEmpty())
                .count();
        System.out.println("Number of words: "+allWords);

    }


    public void countDistinctWords(){
        long distinctWord = lines.stream()
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .filter(e->!e.isEmpty())
                .distinct()
                .count();
        System.out.println("Number of distinct words: "+distinctWord);
    }



    public void findLongestWord(){
        List<List<String>> longestWord = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .map(e -> e.getValue())
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("Longest words:"+longestWord);

    }


    public void findMostFiveAppearingWords(){
        List<String> fiveMostWords = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Most appearing 5 words: "+fiveMostWords);
    }

    public void findMostFiveAppearingLetters(){
        List<String> fiveMostWords = lines.stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Most appearing 5 letters: "+fiveMostWords);
    }



    public void countHowManyTimesAliceAppears() {
        long count = lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e->!e.isEmpty())
                .map(e -> "Alice".equalsIgnoreCase(e))
                .count();
        System.out.println("Alice appearances: "+count);
}

}














































