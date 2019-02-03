package exercise.week11.ex03;

import java.util.Map;

public class BiggerThan30 extends Time{

        private Numbers numberToWord = new Numbers();
        private Map<Integer, String> numbers = numberToWord.getNumbers();

        @Override
        public Boolean isInRange(Integer minute) {
            if (minute > 30 && minute < 60) {
                return true;
            }
            return false;
        }

        @Override
        public String getMessage(Integer hour, Integer minute) {
            return numbers.get(60-minute) + " to " + numbers.get(hour+1);

        }

}
