package exercise.week08.robomime;

public class HashDecryptor implements Decryptor {

    @Override
    public boolean isContain(String line) {
        return line.contains("#");
    }

    @Override
    public String decrypt(String line) {
         line = line.replace("#", "");
         line = line.replace("robomime", "");
         return line;
    }
}
