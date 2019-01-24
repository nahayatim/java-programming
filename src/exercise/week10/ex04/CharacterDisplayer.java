package exercise.week10.ex04;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CharacterDisplayer {

    private static CharacterSummarizer characterSummarizer = new CharacterSummarizer();

    public void displayResult() {

        Integer size = characterSummarizer.countNumberOfCharacters();
        System.out.println("\nNumber of characters appear in book:" + size);

        System.out.println("\nNumber of died characters: " + characterSummarizer.countNumberOfDiedCharacter());

        String percentage = characterSummarizer.calculatePercentageOfMenAndWomen();
        System.out.println("\nPercentage of men and women that died in all books:" + percentage);

        Optional<Map.Entry<String, Long>> bookWithBiggestDeath = characterSummarizer.findBookWithBiggestDeath();
        System.out.println("\nBook " + bookWithBiggestDeath.get().getKey() + " has " + bookWithBiggestDeath.get().getValue() + " death");

        characterSummarizer.findDiedPersonInBookThree().forEach(System.out::println);

        List<String> allegiancesWithBiggestDead = characterSummarizer.findAllegiancesWithBiggestDead();
        System.out.println("\nThe two allegiances that have the biggest dead count: " + allegiancesWithBiggestDead);

        String percentage1 = characterSummarizer.calculateNobilityDeathPercentage();
        System.out.println(percentage1);

        List<String> bookWithStarkAllegiance = characterSummarizer.displayBookWithStarkAllegiance();
        System.out.println("\nThe book with most amount of characters from the Stark allegiance: " + bookWithStarkAllegiance);

        List<String> bookWithLannisterAllegiance = characterSummarizer.displayBookWithLannisterAllegiance();
        System.out.println("\nThe book with the most amount of characters from the Lannister allegiance: " + bookWithLannisterAllegiance);

        long countDiedStarks = characterSummarizer.countDiedStarks();
        System.out.println("\nNumber of died Starks: " + countDiedStarks);

        long countDiedLannister = characterSummarizer.countDiedLannister();
        System.out.println("\nNumber of died Lannister: " + countDiedLannister);

        Boolean thereAliveCharacter = characterSummarizer.isThereAliveCharacter();
        System.out.println("\nIs there any character who didn’t die? " + thereAliveCharacter);

        Boolean thereDiedCharacterInIntroducedChapter = characterSummarizer.isThereDiedCharacterInIntroducedChapter();
        System.out.println("\nHas any character ever been killed in the same chapter that it got introduced? " + thereDiedCharacterInIntroducedChapter);


    }
}
