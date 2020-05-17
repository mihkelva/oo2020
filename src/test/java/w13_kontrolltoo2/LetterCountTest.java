package w13_kontrolltoo2;

import junit.framework.TestCase;

import java.io.IOException;

public class LetterCountTest extends TestCase {
    Sentence pereTest = new Sentence();
    Sentence lauseTest = new Sentence();

    public LetterCountTest() throws IOException {}

    public void setUp() throws Exception {
        Word[] pere = {new Word("pere")};
        pereTest.setSentence(pere);

        Word[] lause = {
                new Word("Siin"),
                new Word("on"),
                new Word("viis"),
                new Word("i"),
                new Word("tähte"),
        };
        lauseTest.setSentence(lause);
    }

    public void testCountLetterAInPere() throws IOException {
        assertEquals(0, pereTest.countLetter('a'));
    }

    public void testCountLetterPInPere() throws IOException {
        assertEquals(1, pereTest.countLetter('p'));
    }

    public void testCountLetterEInPere() throws IOException {
        assertEquals(2, pereTest.countLetter('e'));
    }

    public void testCountLetterInSentence() throws IOException {
        assertEquals(5, lauseTest.countLetter('i'));
    }
}