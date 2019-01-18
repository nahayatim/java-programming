package exercise.week07.ex01;

import java.util.List;

public class MoneyCalculator {

    public Integer calculateMoney(List<Integer>payments){
        int totalMoney=0;
        for (Integer payment : payments) {
            totalMoney=totalMoney+payment;
        }
        return totalMoney;

    }
}
