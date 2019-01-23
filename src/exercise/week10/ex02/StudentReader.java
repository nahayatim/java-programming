package exercise.week10.ex02;

import exercise.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    public List<Student> getStudents() {

        return new FileReader().asStream("exercise/week10/ex02/students-performance.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Student(
                        columns[0],
                        (columns[1]),
                        Integer.valueOf(columns[2]),
                        Integer.valueOf(columns[3]),
                        Integer.valueOf(columns[4])
                ))
                .collect(Collectors.toList());
    }
}
