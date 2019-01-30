package exercise.week11.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MilitaryTimeTest {

    private MilitaryTime militaryTime = new MilitaryTime();

    @Test
    void testMidnight() {

        String midnight = militaryTime.toMilitaryTime("12:00:00 AM");
        String expected = "00:00:00";
        Assertions.assertEquals(expected, midnight);
    }

    @Test
    void testNoon() {

        String noon = militaryTime.toMilitaryTime("12:00:00 PM");
        String expected = "12:00:00";
        Assertions.assertEquals(expected, noon);
    }

    @Test
    void testSevenInTheAfternoon() {

        String seven = militaryTime.toMilitaryTime("07:05:45 PM");
        String expected = "19:05:45";
        Assertions.assertEquals(expected, seven);
    }

}