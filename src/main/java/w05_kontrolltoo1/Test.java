package w05_kontrolltoo1;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("datainput.txt");
        File fileW = new File("dataoutput.txt");
        System.out.println(
                file.getName() +
                file.isFile() +
                file.isDirectory() +
                file.isHidden() +
                file.lastModified()
        );

        System.out.println(
                file.getName() +
                        fileW.isFile() +
                        fileW.isDirectory() +
                        fileW.isHidden() +
                        fileW.lastModified()
        );

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br2 = new BufferedReader((new FileReader(new File("test.txt"))));

       String line = br.readLine();
       while (line != null){
           System.out.println(line);
           line = br.readLine();
       }

       br.close();
       fr.close();

       PrintWriter pw = new PrintWriter(fileW);
       Scanner scanner = new Scanner(file);

       while (scanner.hasNextLine()){
           String line2 = scanner.nextLine();
           String[] lineData = line2.split(",");
           
           pw.println(
                "Number is " + lineData[0] +
                " and name is " + lineData[1] + 
                " and favourite animal is " + lineData[2] +
                " and graduation year is " + lineData[3]
            );

        //    System.out.println(scanner.nextLine());
        //    pw.println(scanner.nextLine());
        //    scanner.nextLine();
       }

       scanner.close();
       pw.close();

    }
}
