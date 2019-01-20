package exercise.week08.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {


    public Integer scout(String name) {
        return scout(name, letter -> (int) letter.charAt(0));
    }

    public Integer scoutEnhaced(String name) {
        return scout(name, letter -> (int) letter.toLowerCase().charAt(0));
    }

    private Integer scout(String name, Function<String, Integer> formula) {
        int powerlevel = 0;
        String[] splitedName = name.split("");
        List<String> characters = Arrays.asList(splitedName);
        for (String character : characters) {
            int ascii = formula.apply(character);
            powerlevel += ascii;
        }

        return powerlevel;
    }

}