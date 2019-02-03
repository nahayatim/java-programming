package exercise.week11.ex03;

import java.time.LocalTime;

public class Morning extends Moment {

    //  For hours between 6:00 and 11:59, say in the morning

    public Morning() {
        super(LocalTime.of(6, 00), LocalTime.of(11, 59), "in the morning");
    }
}
