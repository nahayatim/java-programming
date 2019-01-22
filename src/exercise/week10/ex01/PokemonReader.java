package exercise.week10.ex01;

import exercise.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {

    public List<Pokemon> getPokemon() {
        return new FileReader().asList("exercise/week10/ex01/pokemon.csv").stream()
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Pokemon(
                        Integer.valueOf(columns[0]),
                        columns[1],
                        columns[2],
                        columns[3],
                        Integer.valueOf(columns[4]),
                        Integer.valueOf(columns[5]),
                        Integer.valueOf(columns[6]),
                        Integer.valueOf(columns[7]),
                        Integer.valueOf(columns[8]),
                        Integer.valueOf(columns[9]),
                        Integer.valueOf(columns[10]),
                        Integer.valueOf(columns[11]),
                        Boolean.valueOf(columns[12])))
                .collect(Collectors.toList());

    }

}
