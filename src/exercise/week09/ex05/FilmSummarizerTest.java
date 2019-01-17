package exercise.week09.ex05;

import org.junit.jupiter.api.Test;

import java.util.List;

class FilmSummarizerTest {
    FilmSummarizer filmSummarizer = new FilmSummarizer();

    @Test
    void top3HighestRaitingSortedByRating() {

        List<Film> top3HighestRaitingSortedByRating = filmSummarizer.top3HighestRaitingSortedByRating();
        System.out.println("\nTop 3 with highest rating, sorted by rating:");
        System.out.println(top3HighestRaitingSortedByRating);
    }

    @Test
    void top3HighestRaitingLongerThan3Hours() {

        List<Film> longerThan3Hours = filmSummarizer.top3HighestRaitingLongerThan3Hours();
        System.out.println("\nTop 3 with highest rating longer than 3 hours, sorted by rating:");
        System.out.println(longerThan3Hours);
    }

    @Test
    void top4ExpensiveSortedByBudget() {

        List<Film> expensiveFilms = filmSummarizer.top4ExpensiveSortedByBudget();
        System.out.println("Top 4 most expensive, sorted by budget:");
        System.out.println(expensiveFilms);
    }

    @Test
    void top4ExpensiveShorterThan90SortedByBudget() {

        List<Film> expensiveAndShorterThan90 = filmSummarizer.top4ExpensiveShorterThan90SortedByBudget();
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget:");
        System.out.println(expensiveAndShorterThan90);
    }

    @Test
    void top4RatedHigherThan7SortedByBudget() {

        List<Film> ratedHigherThan7SortedByBudget = filmSummarizer.top4RatedHigherThan7SortedByBudget();
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        System.out.println(ratedHigherThan7SortedByBudget);
    }
}