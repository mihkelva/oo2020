package w13_kontrolltoo2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Sentence sentence1 = new Sentence();
        Word[] sentenceWords = {
                new Word("Elas"),
                new Word("metsas"),
                new Word("mutionu"),
                new Word("keset"),
                new Word("kuuski"),
                new Word("noori"),
                new Word("vanu"),
                new Word("kadakjuure"),
                new Word("puu"),
                new Word("poosa")
        };
        sentence1.setSentence(sentenceWords);
        int test = sentence1.countLetter('a');
        System.out.println(sentence1.countInSentenceAndWords('o', sentence1.getSentence()));
    }
}
