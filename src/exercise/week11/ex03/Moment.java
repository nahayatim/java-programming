package exercise.week11.ex03;

import java.time.LocalTime;

public abstract class Moment {

    private LocalTime start;
    private LocalTime end;
    private String name;

    public Moment(LocalTime start, LocalTime end, String name) {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public String getMoment() {
        return name;
    }

    public Boolean isBetween(LocalTime currentTime) {
        boolean isBetweenInterval = currentTime.isAfter(start) && currentTime.isBefore(end);
        boolean isEqualInterval = currentTime.equals(start) || currentTime.equals(end);
        return isBetweenInterval || isEqualInterval;
    }
}

