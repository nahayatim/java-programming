package exercise.week11.ex02;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MilitaryTime {

    public String toMilitaryTime(String timeFormat12Hour) {

        LocalTime currentTime = LocalTime.parse(timeFormat12Hour, DateTimeFormatter.ofPattern("hh:mm:ss a"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return currentTime.format(dateTimeFormatter);
    }

}
