package exercise.week07.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {

    public List<Integer> collectMoney() {

        List<Integer> payments = new ArrayList<>();
        Random random = new Random();
        for (int times = 0; times < 10; times++) {
            int payment = random.nextInt(5) + 1;
            payments.add(payment);
        }
        return payments;
    }
}
