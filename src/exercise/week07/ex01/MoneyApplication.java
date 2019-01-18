package exercise.week07.ex01;

import java.util.List;

public class MoneyApplication {
    public static void main(String[] args) {

        MoneyCollector collector = new MoneyCollector();
        List<Integer> collectedMoney = collector.collectMoney();

        System.out.println("money collected from each friend: " + collectedMoney);

        MoneyCalculator calculator = new MoneyCalculator();
        Integer totalMoney = calculator.calculateMoney(collectedMoney);
        System.out.println("Accumulated value: " + totalMoney);

    }
}
