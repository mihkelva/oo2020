package w13_kontrolltoo2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Sentence extends LetterCount {
    Word[] sentence;

    protected Sentence() throws IOException {}

    public int wordCount() {
        int count = 0;
        count = sentence.length;
        return count;
    }

    public Word[] getSentence() {
        return sentence;
    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }

    public int countLetter(char a) throws IOException {
        return super.countLetter(a, getSentence());
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + Arrays.toString(sentence) +
                '}';
    }
}
