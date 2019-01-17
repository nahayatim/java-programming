package exercise.week09.ex05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {


    private List<Film> films = new FilmReader().getFilms();


    public List<Film> top3HighestRaitingSortedByRating() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }


    public List<Film> top3HighestRaitingLongerThan3Hours() {
        return films.stream()
                .filter(film -> film.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> top4ExpensiveSortedByBudget() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());

    }

    public List<Film> top4ExpensiveShorterThan90SortedByBudget() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(film -> film.getRuntime() < 90)
                .limit(4)
                .collect(Collectors.toList());
    }


    public List<Film> top4RatedHigherThan7SortedByBudget() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(film -> film.getScore() > 7)
                .filter(film -> film.getBudget() > 50000)
                .filter(film -> film.getBudget() < 500000)
                .limit(4)
                .collect(Collectors.toList());
    }

}







