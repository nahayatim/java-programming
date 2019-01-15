package exercise.week09.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            numbers.add(i);
        }


        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);


        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);


        List<Integer> biggerThan = numbers.stream()
                .filter(number -> number % 3 == 0)
                .filter(number -> number > 10)
                .collect(Collectors.toList());
        System.out.println(biggerThan);


        List<Integer> smallerthan = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println(smallerthan);

        List<String> collect = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                .map(num -> "number " + num + " has " + num.toString().length() + " digits")
                .collect(Collectors.toList());

        System.out.println(collect);
//        List<Integer>digits= numbers.stream()
//                .filter(e->e>8)
//                .filter(e->e<12)
//                .collect(Collectors.toList());
//
//        digits.stream()
//                .forEach(e-> System.out.println("number "+e+" has "+e.toString().length()+" digits"));
//
//
    }

}

