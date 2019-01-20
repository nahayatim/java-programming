package exercise.week08.robomime;

import robomime.FileReader;

import java.util.List;

public class Sensor {

    private robomime.FileReader reader = new FileReader();
    private Decryptions decryptor = new Decryptions();

    public List<String> scan() {
        List<String> lines = reader.asLines("exercise/week08/robomime/robomime.txt");
        return decryptor.decrypt(lines);
    }
}
