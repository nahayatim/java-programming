package exercise.week08.ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFilterTest {

    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    @Test
    void getEven() {
        List<Integer> even = filter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        Assertions.assertEquals(expected, even);
    }

    @Test
    void getOdd() {
        List<Integer> odd = filter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
        Assertions.assertEquals(expected, odd);
    }


}