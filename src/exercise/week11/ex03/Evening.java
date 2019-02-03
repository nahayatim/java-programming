package exercise.week11.ex03;

import java.time.LocalTime;

public class Evening extends Moment {

    public Evening() {

        super(LocalTime.of(17, 00), LocalTime.of(20, 00), "in the evening");
    }
}
