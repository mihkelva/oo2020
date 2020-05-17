package w13_kontrolltoo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public abstract class LetterCount {

    public int countLetter(char a, Word[] sentence) throws IOException {
        List<String> wordsBefore = Files.readAllLines(Paths.get("src\\main\\java\\w13_kontrolltoo2\\AllWords.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("src\\main\\java\\w13_kontrolltoo2\\AllWords.txt"));
        int count = 0;
        for (Word wordInSentence : sentence) {
            String wordAsString = wordInSentence.toString();
            String[] wordLetters = wordAsString.split("");
            for (String wordLetter : wordLetters) {
                if (String.valueOf(a).equals(wordLetter)) {
                    count++;
                }
            }
            pw.println(wordInSentence);
            boolean newWord = true;
            int i = wordsBefore.size();
            while(newWord && i > 0) for (String s : wordsBefore) {
                if (String.valueOf(wordInSentence).equals(s)) {
                    newWord = false;
                    break;
                }
                i--;
            }
            if(newWord){
                System.out.println("Uus: " + wordInSentence);
            }
        }
        for (String oldWord: wordsBefore) {
            System.out.println("Vana:   " + oldWord);
        }
        pw.close();
        return count;
    }

    public HashMap<String, Integer> countInSentenceAndWords(char a, Word[] sentence){
        int sentenceCount = 0;
        HashMap<String, Integer> counts = new HashMap<>();
        for (Word wordInSentence : sentence) {
            int wordCount = 0;
            String wordAsString = wordInSentence.toString();
            String[] wordLetters = wordAsString.split("");
            for (String wordLetter : wordLetters) {
                if (String.valueOf(a).equals(wordLetter)) {
                    sentenceCount++;
                    wordCount++;
                    counts.put(wordAsString, wordCount);
                }
            }
            counts.put("Sentence total", sentenceCount);
        }
        return counts;
    }
}
