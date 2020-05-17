package w09_stream.kodused;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream {
    // 2) Luua mingisugune näide lisaks, mis kasutab kuidagi reaaleluliselt stream-i näidet,
    // kus kasutad vähemalt 5 chaining meetodit, tulemused võiks ka salvestada faili, lugeda võib samuti failist.
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("src\\main\\java\\w09_stream\\kodused\\proccesed_data.txt"));

        Files.readAllLines(Paths.get("src\\main\\java\\w09_stream\\kodused\\data.txt")).stream()
                .map(e -> e.split(" "))
                .filter(e -> e[1].equals("eurot"))
                .filter(e -> Integer.parseInt(e[0]) > 200)
                .map(e -> e[1].substring(0,4) + ": " + e[0]+".00")
                .peek(System.out::println)
                .forEach(pw::println);

        pw.close();
    }
}
