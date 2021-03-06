package w09_stream;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamFiles {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("src\\main\\java\\w09_stream\\proccesed_data.txt"));

        Files.readAllLines(Paths.get("src\\main\\java\\w09_stream\\data.txt")).stream()
                .map(e -> e.split(","))
                .filter(e -> Integer.parseInt(e[1]) < 5)
                .map(e -> e[1] + " | " + e[0])
                .forEach(pw::println);

        pw.close();
    }

}