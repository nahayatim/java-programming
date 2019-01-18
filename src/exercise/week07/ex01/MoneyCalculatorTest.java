package exercise.week07.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MoneyCalculatorTest {

    private MoneyCalculator calculator = new MoneyCalculator();

    @Test
    void calculateMoney() {
        Integer totalMoney = calculator.calculateMoney(Arrays.asList(3, 2, 1, 4, 1, 3, 4, 2, 1, 2));
        Assertions.assertEquals(23, totalMoney);

    }
}