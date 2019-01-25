package reflection.reflection10;

import exercise.week10.ex04.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class AliceReader {

        public List<String> getLine(){
            return new FileReader().asStream("reflection/reflection10/alice.txt")
                    .map(String::toLowerCase)
                    .map(e->e.replaceAll(","," "))
                    .map(e->e.replaceAll(";"," "))
                    .map(e->e.replaceAll("’s"," "))
                    .map(e->e.replaceAll("’"," "))
                    .map(e->e.replaceAll("‘"," "))
                    .map(e->e.replaceAll(":"," "))
                    .map(e->e.replaceAll("#"," "))
                    .map(e->e.replaceAll("/"," "))
                    .map(e->e.replaceAll("-"," "))
                    .map(e->e.replaceAll("\\."," "))
                    .map(e->e.replaceAll("\\*"," "))
                    .map(e->e.replaceAll(" \\("," "))
                    .map(e->e.replaceAll(" \\)"," "))
                    .map(e->e.replaceAll(" \\["," "))
                    .map(e->e.replaceAll(" \\]"," "))
                    .collect(Collectors.toList());

        }
    }

