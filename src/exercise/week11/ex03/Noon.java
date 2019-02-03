package exercise.week11.ex03;

import java.time.LocalTime;

public class Noon extends Moment {

    //   At 12 o’clock, replace the whole message by noon

    public Noon() {
        super(LocalTime.of(00, 00), LocalTime.of(00, 00), "noon");
    }
}
