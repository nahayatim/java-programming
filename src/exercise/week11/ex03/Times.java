package exercise.week11.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Times {

    public List<Time> getTimes() {
        return new ArrayList<>(Arrays.asList(
                new SmallerOrEquall30(),
                new Oclock(),
                new BiggerThan30()
        ));
    }
}

