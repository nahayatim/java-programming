package exercise.week08.robomime;

public class ExclamationDecryptor implements Decryptor {

    @Override
    public boolean isContain(String line) {
        return line.contains("!");
    }


    @Override
    public String decrypt(String line) {
        return line.replace("!", "");
    }
}
