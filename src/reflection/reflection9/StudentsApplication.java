package reflection.reflection9;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentsApplication {
    public static void main(String[] args) {

        List<Student> students= new StudenReader().getStudents();

        int size = students.size();
        System.out.println("Total number of student performance entries: "+size);

        List<Student> femaleStudents = students.stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
        System.out.println("Number of female students:"+femaleStudents.size());

        List<Student> maleStudents = students.stream()
                .filter(student -> student.getGender().equals("male"))
                .collect(Collectors.toList());
        System.out.println("Number of male students:"+maleStudents.size());



            Set<Student> educationalSortedList = students.stream()
                    .sorted(Comparator.comparing(Student::getParentalLevelOfEducation).reversed())
                    .collect(Collectors.toSet());
        System.out.println(" Parental education levels sorted alphabetically: "+ educationalSortedList);

        long scoreHigherThan90 = students.stream()
                .filter(student -> student.getMathScore() > 90)
                .filter(student -> student.getWritingScore() > 90)
                .filter(student -> student.getReadingScore() > 90)
                .count();
        System.out.println(" Number of students with scores higher than 90: "+scoreHigherThan90);

        List<String> scoreEqual100 = students.stream()
                .filter(student -> student.getMathScore() == 100)
                .filter(student -> student.getWritingScore() == 100)
                .filter(student -> student.getReadingScore() == 100)
                .map(student -> student.getGender())
                .collect(Collectors.toList());
        System.out.println(" Number of students with scores equal to 100: "+scoreEqual100);

        }

    }






















