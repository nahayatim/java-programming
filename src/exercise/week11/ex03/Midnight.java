package exercise.week11.ex03;

import java.time.LocalTime;

public class Midnight extends Moment {

    public Midnight() {
        super(LocalTime.of(24, 00), LocalTime.of(24, 00), "midnight");
    }
}
