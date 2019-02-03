package exercise.week11.ex03;

import java.time.LocalTime;

public class Night extends Moment {

    public Night() {
        super(LocalTime.of(20, 01), LocalTime.of(5, 59), "at night");
    }
}
