package exercise.week11.ex03;


import java.time.LocalTime;
import java.util.List;

public class Converter {

    private Times time = new Times();
    private List<Time> times = time.getTimes();
    private List<Moment> moments = Moments.getMoment();


    public String toWord(Integer hour, Integer minute) {
        for (Time time : times) {
            if (time.isInRange(minute)) {
                return time.getMessage(hour, minute);
            }
        }
        return "Invalid time!";
    }

    public String toMoment(Integer hour, Integer minute) {
        LocalTime currentTime = LocalTime.of(hour, minute);
        for (Moment moment : moments) {
            if (moment.isBetween(currentTime)) {
                return moment.getMoment();
            }
        }
        return "Invalid time!";
    }
}


