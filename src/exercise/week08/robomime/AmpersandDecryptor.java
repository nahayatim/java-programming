package exercise.week08.robomime;

public class AmpersandDecryptor implements Decryptor {

    @Override
    public boolean isContain(String line) {

        return line.contains("&");
    }


    @Override
    public String decrypt(String line) {
        String replace = line.replace("&", "");
        String reversed = new StringBuilder().reverse().toString();
        return reversed;

    }
}
