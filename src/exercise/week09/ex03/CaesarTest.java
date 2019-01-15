package exercise.week09.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    private Caesar caesar=new Caesar();

    @Test
    void testBigLetter(){
        String hello = caesar.cipher("HELLO", 1);
        String expected = "IFMMP";
        Assertions.assertEquals(expected,hello);
    }

    @Test
    void testSmallLetterWithSymbols(){
        String helloWorld = caesar.cipher("hello, world", 13);
        String expected="uryyb, jbeyq";
        Assertions.assertEquals(expected,helloWorld);
    }

    @Test
    void testSentence(){
        String sentence =caesar.cipher("be sure to drink your Ovaltine",13);
        String expected="or fher gb qevax lbhe Binygvar";
        Assertions.assertEquals(expected,sentence);
    }

}