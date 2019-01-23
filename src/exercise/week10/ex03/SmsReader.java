package exercise.week10.ex03;

import exercise.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {

    public List<Sms> getSms() {

        return new FileReader().asStream("exercise/week10/ex03/sms.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Sms(
                        columns[0],
                        (columns[1])
                ))
                .collect(Collectors.toList());
    }
}
