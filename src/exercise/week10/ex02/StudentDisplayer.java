package exercise.week10.ex02;


import java.util.List;
import java.util.Map;

public class StudentDisplayer {

    private StudentPerformance studentPerformance = new StudentPerformance();

    public void displayPerformance() {
        System.out.println("\nParent education level appearances:");
        Map<String, Long> parentEducationLevelAppearances = studentPerformance.getParentEducationLevelAppearances();
        System.out.println(parentEducationLevelAppearances);

        System.out.println("\nParent education level appearances sorted top bottom:");
        List<String> sortedParentEducationLevel = studentPerformance.sortedParentEducationLevel();
        sortedParentEducationLevel.forEach(System.out::println);

        System.out.println("\nNumber of students with high parent education and lower scores than 60:");
        Long numberOfStudentWithHighParentEducationAndLowerScore = studentPerformance.numberOfStudentWithHighParentEducationAndLowerScore();
        System.out.println(numberOfStudentWithHighParentEducationAndLowerScore);


        System.out.println("\nGenders and average scores of the top four average score students: ");
        List<String> topFourGenderAndAverageScore = studentPerformance.topFourGenderAndAverageScore();
        topFourGenderAndAverageScore.forEach(System.out::println);

        System.out.println("\nIs there any student with a parent education level of some high school that has at least 97 in every topic?");
        Boolean anyStudentWithParentEducationSomehighschool = studentPerformance.isAnyStudentWithParentEducationSomehighschool();
        System.out.println(anyStudentWithParentEducationSomehighschool);

    }
}
