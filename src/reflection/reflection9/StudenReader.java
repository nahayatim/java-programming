package reflection.reflection9;

import exercise.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudenReader {
    public List<Student> getStudents() {

        return new FileReader().asStream("reflection/reflection9/students-performance.csv")
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
