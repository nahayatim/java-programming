package exercise.week09.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {

        // a list of the first twenty numbers
        List<Integer>numbers =new ArrayList<>();
        for (int i = 1; i<21 ; i++){
            numbers.add(i);
        }

        //a list of the even numbers
        List<Integer> evenNumbers=numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        //a list of the odd numbers
        List<Integer>oddNumbers=numbers.stream()
                .filter(number->number%2==1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        // list of the numbers divisible by 3 and bigger than 10
        List<Integer>biggerThan= numbers.stream()
                .filter(number->number%3==0)
                .filter(number->number>10)
                .collect(Collectors.toList());
        System.out.println(biggerThan);

        //smaller than 5 and multiply them by 3
        List<Integer>smallerthan=numbers.stream()
                .filter(e->e<5)
                .map(e->e*3)
                .collect(Collectors.toList());
        System.out.println(smallerthan);

        List<Integer>digits= numbers.stream()
                .filter(e->e>8)
                .filter(e->e<12)
                .collect(Collectors.toList());

        digits.stream()
                .forEach(e-> System.out.println("number "+e+" has "+e.toString().length()+" digits"));


        }



    }

