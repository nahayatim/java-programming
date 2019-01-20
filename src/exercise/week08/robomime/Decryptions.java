package exercise.week08.robomime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Decryptions {


    private List<Decryptor> decryptors = Arrays.asList(
            new ExclamationDecryptor(), new AmpersandDecryptor(), new HashDecryptor()
    );

    public List<String> decrypt(List<String> ciphertexts) {
        List<String> plaintexts = new ArrayList<>();
        for (String ciphertext : ciphertexts) {
            Optional<String> plaintext = decrypt(ciphertext);
            if (plaintext.isPresent()) {
                plaintexts.add(plaintext.get());
            }
        }
        return plaintexts;
    }

    Optional<String> decrypt(String ciphertext) {
        for (Decryptor strategy : decryptors) {
            if (strategy.isContain(ciphertext)) {
                String plaintext = strategy.decrypt(ciphertext);
                return Optional.of(plaintext);
            }
        }
        return Optional.empty();
    }

}
