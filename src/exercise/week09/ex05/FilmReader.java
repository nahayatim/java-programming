package exercise.week09.ex05;

import exercise.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    public List<Film> getFilms() {

        return new FileReader().asStream("exercise/week09/ex05/films.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Film(
                        columns[8],
                        Double.valueOf(columns[9]),
                        Long.valueOf(columns[10]),
                        Integer.valueOf(columns[6]),
                        Long.valueOf(columns[0]),
                        Long.valueOf(columns[5])
                ))
                .collect(Collectors.toList());
    }
}
