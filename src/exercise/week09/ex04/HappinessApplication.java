package exercise.week09.ex04;

import exercise.week09.ex02.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessApplication {



    public static void main(String[] args) {


        new FileReader().asStream("exercise/week09/ex04/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), Double.valueOf(e[2])))
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(System.out::println);

    }
}
