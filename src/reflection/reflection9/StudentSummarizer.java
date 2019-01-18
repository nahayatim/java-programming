package reflection.reflection9;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {

    private List<Student> students = new StudenReader().getStudents();
    int size = students.size();


    public void displayNumberOfFemaleStudents() {
        List<Student> femaleStudents = students.stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
        System.out.println("Total number of student performance entries: " + size);

        System.out.println("Number of female students:" + femaleStudents.size());
    }


    public void displayNumberOfMaleStudents() {
        List<Student> maleStudents = students.stream()
                .filter(student -> student.getGender().equals("male"))
                .collect(Collectors.toList());
        System.out.println("Number of male students:" + maleStudents.size());
    }


    public void displayParentalEducationLevelsSortedAlphabetically() {
        List<String> educationalSortedList = students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically: " + educationalSortedList);
    }


    public void displayNumberOfStudentsWithScoresHigherThan90() {
        long scoreHigherThan90 = students.stream()
                .filter(student -> student.getMathScore() > 90)
                .filter(student -> student.getWritingScore() > 90)
                .filter(student -> student.getReadingScore() > 90)
                .count();
        System.out.println("Number of students with scores higher than 90: " + scoreHigherThan90);
    }


    public void displayNumberOfStudentsWithScore100() {
        List<String> genders = students.stream()
                .filter(student -> student.getMathScore() == 100)
                .filter(student -> student.getWritingScore() == 100)
                .filter(student -> student.getReadingScore() == 100)
                .map(student -> student.getGender())
                .collect(Collectors.toList());
        long scoreEqual100 = genders.stream()
                .count();

        System.out.println("Number of students with scores equal to 100: " + scoreEqual100);
        System.out.println("Genders of these students are: " + genders);
    }

}
