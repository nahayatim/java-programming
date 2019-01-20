package exercise.week08.ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {
    private PowerLevelScouter scouter = new PowerLevelScouter();

    @Test
    void scout() {
        Integer actual = scouter.scout("Susana");
        Integer expected = 619;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void scoutEnhaced() {
        Integer actual = scouter.scoutEnhaced("Susana");
        Integer expected = 651;
        Assertions.assertEquals(expected, actual);
    }
}