package exercise.week11.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moments {

    public static List<Moment> getMoment() {
        return new ArrayList<>(Arrays.asList(
                new Morning(),
                new Noon(),
                new Afternoon(),
                new Evening(),
                new Night(),
                new Midnight()
        ));
    }
}
