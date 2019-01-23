package exercise.week10.ex02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StudentPerformance {

    private List<Student> students = new StudentReader().getStudents();

    public Map<String, Long> getParentEducationLevelAppearances() {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }


    public List<String> sortedParentEducationLevel() {
        return getParentEducationLevelAppearances()
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .collect(Collectors.toList());
    }


    public Long numberOfStudentWithHighParentEducationAndLowerScore() {
        return students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("master's degree"))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();
    }


    public List<String> topFourGenderAndAverageScore() {
        return students.stream()
                .map(e -> new AverageData(e.getGender(), avgNumber(e)))
                .sorted((e1, e2) -> e2.getAvg().compareTo(e1.getAvg()))
                .limit(4)
                .map(AverageData::toString)
                .collect(Collectors.toList());
    }

    private Integer avgNumber(Student e) {
        return (e.getReadingScore() + e.getMathScore() + e.getWritingScore()) / 3;
    }


    public Boolean isAnyStudentWithParentEducationSomehighschool() {
        return students.stream()
                .filter(e -> e.getWritingScore() >= 97)
                .filter(e -> e.getReadingScore() >= 97)
                .filter(e -> e.getMathScore() >= 97)
                .anyMatch(e -> e.getParentalLevelOfEducation().equals("some high school"));

    }
}

