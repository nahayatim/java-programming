package exercise.week11.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    private Converter convert = new Converter();

//    @Test
//    void toWord() {
//                String result = convert.toWord(24, 00);
//                System.out.println(result);
//            }


    @Test
    void testOClock() {
        String result = convert.toWord(12, 0) + " "
                + convert.toMoment(12, 0);
        Assertions.assertEquals("twelve O'Clock! noon", result);
    }

    @Test
    void testMidnight() {
        String result = convert.toWord(00, 00) + " "
                + convert.toMoment(00, 00);
        Assertions.assertEquals(" midnight", result);
    }

    @Test
    void testHalfPast() {
        String result = convert.toWord(13, 30) + " "
                + convert.toMoment(13, 30);
        Assertions.assertEquals("half past thirteen in the afternoon", result);
    }

    @Test
    void testMinToHour() {
        String result = convert.toWord(13, 40) + " "
                + convert.toMoment(13, 40);
        Assertions.assertEquals("twenty to fourteen  in the afternoon", result);
    }

    @Test
    void testMinPastHour() {
        String result = convert.toWord(20, 0) + " "
                + convert.toMoment(20, 0);
        System.out.println(result);
    }
}