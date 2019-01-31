package exercise.week11.ex02;

import java.time.format.DateTimeFormatter;

public class MilitaryTime {

    private DateTimeFormatter format12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
    private DateTimeFormatter format24 = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String toMilitaryTime(String time) {

        return format24.format(format12.parse(time));
    }

}
