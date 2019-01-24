package exercise.week10.ex04;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterSummarizer {

    List<Character> characterList = new CharacterReader().getCharacter();


    public Integer countNumberOfCharacters() {
        return characterList.size();
    }


    public long countNumberOfDiedCharacter() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().equals(""))
                .count();
    }


    public String calculatePercentageOfMenAndWomen() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getGender()
                                .replaceAll("0", "Women")
                                .replaceAll("1", "Men")
                        , Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / countNumberOfDiedCharacter() + "%")
                .collect(Collectors.joining(" "));
    }


    public Optional<Map.Entry<String, Long>> findBookWithBiggestDeath() {
        return characterList.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();

    }


    public List<String> findDiedPersonInBookThree() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getBookOfDeath().equals("3"))
                .collect(Collectors.groupingBy(e -> e.getName(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }


    public List<String> findAllegiancesWithBiggestDead() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getAllegiances(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }


    public String calculateNobilityDeathPercentage() {
        return characterList.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getNobility().equals("1"))
                .collect(Collectors.groupingBy(e -> e.getNobility(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey().replaceAll("1", "nobility") + ": " + (e.getValue() * 100) / countNumberOfDiedCharacter() + "%")
                .collect(Collectors.joining(" "));

    }


    public List<String> displayBookWithStarkAllegiance() {
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Stark"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book number: " + e.getKey())
                .limit(1)
                .collect(Collectors.toList());
    }


    public List<String> displayBookWithLannisterAllegiance() {
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book number: " + e.getKey())
                .limit(1)
                .collect(Collectors.toList());
    }


    public long countDiedStarks() {
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Stark"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
    }


    public long countDiedLannister() {
        return characterList.stream()
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
    }


    public Boolean isThereAliveCharacter() {
        return characterList.stream()
                .anyMatch(e -> e.getDeathYear().isEmpty());
    }


    public Boolean isThereDiedCharacterInIntroducedChapter() {
        return characterList.stream()
                .anyMatch(e -> e.getDeathYear().equals(e.getBookIntroChapter()));
    }


}
