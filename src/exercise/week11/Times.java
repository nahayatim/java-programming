package exercise.week11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Times {

    public static void main(String[] args) {

        System.out.println("----Instant");

        Instant now = Instant.now();
        System.out.println("Instant: " + now);

        Instant fiftySecondsLater = now.plusSeconds(50);
        System.out.println("Instant after 50 seconds: " + fiftySecondsLater);

        boolean isAfter = fiftySecondsLater.isAfter(now);
        System.out.println("Is after: " + isAfter);

        System.out.println("\n---Duration----");

        Instant begin = Instant.now();
        Instant end = begin.plus(50, ChronoUnit.DAYS);
        Duration duration = Duration.between(begin, end);
        System.out.println("Duration: " + duration);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());

        System.out.println("\n----LOCAL DATE----");

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        LocalDate fiveWeeksAgo = today.minusWeeks(5);
        System.out.println("Five weeks ago: " + fiveWeeksAgo);
        LocalDate someDaysThisYear = LocalDate.parse("2019-06-06");
        System.out.println("This year is a leap year: " + someDaysThisYear.isLeapYear());
        System.out.println("Last year was a leap year: " + someDaysThisYear.minusYears(1).isLeapYear());
        System.out.println("Next year will be a leap year: " + someDaysThisYear.plusYears(1).isLeapYear());

        System.out.println("\n----LOCAL TIME----");

        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        LocalTime someTime = LocalTime.parse("13:37:33");
        System.out.println("Some time: " + someTime);
        System.out.println("Hours: " + someTime.getHour());
        System.out.println("Minutes: " + someTime.getMinute());
        System.out.println("Seconds: " + someTime.getSecond());

        System.out.println("\n---LOCAL DATE TIME-----");

        System.out.println("Right now: " + LocalDateTime.now());
        LocalDateTime someMoment = LocalDateTime.of(someDaysThisYear, someTime);
        System.out.println("some moment: " + someMoment);

        System.out.println("\n---PERIOD----");

        Period period = Period.between(today, someDaysThisYear);
        System.out.println("Period: " + period);
        System.out.println("Period in years: " + period.getYears());
        System.out.println("Period in month: " + period.getMonths());
        System.out.println("Period in days: " + period.getDays());

        System.out.println("\n---ZONED HUMAN TIME---");

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("Now: " + now1);
        ZoneId here = ZoneId.systemDefault();
        System.out.println("Here: " + here);
        ZonedDateTime nowHere = now.atZone(here);
        System.out.println("Now here: " + nowHere);
        System.out.println("Available zones: " + ZoneId.getAvailableZoneIds());
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime nowInNewYork = nowHere.withZoneSameInstant(newYork);
        System.out.println("Now in New York: " + nowInNewYork);

        System.out.println("\n -----CHORONO UNIT-----");
        LocalDate after = today.plus(123456789, ChronoUnit.DAYS);
        Period period1 = Period.between(today, after);
        System.out.println("Period in years: " + period1.getYears());
        System.out.println("Period in months: " + period1.getMonths());
        System.out.println("Period in Days: " + period1.getDays());

        long days = ChronoUnit.DAYS.between(today, after);
        System.out.println("Period in days: " + days);

        System.out.println("\n-----TEMPORAL ADJUSTER----");

        LocalDate firstDayOf2020 = LocalDate.of(2019, 06, 06).with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First day of next year: " + firstDayOf2020);
        System.out.println("First day of next year will be a: " + firstDayOf2020.getDayOfWeek());
        System.out.println("First day of next year will be the: " + firstDayOf2020.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

        System.out.println("\n----TIME FORMATTING---");

        System.out.println("Now in standard formatting: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYY HH|mm|ss");
        String formatted = now1.format(formatter);
        System.out.println("Now formatted: " + formatted);
    }
}
