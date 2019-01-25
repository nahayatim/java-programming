package reflection.reflection10;


public class AliceApplication {

    private static AliceDisplayer displayer=new AliceDisplayer();

        public static void main(String[] args) {

            displayer.countAllWords();
            displayer.countDistinctWords();
            displayer.findLongestWord();
            displayer.findMostFiveAppearingWords();
            displayer.findMostFiveAppearingLetters();
            displayer.countHowManyTimesAliceAppears();
        }
}

