package w14_seminar;

import w09_stream.Example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TryCatch {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta oma vanus suuremana kui tegelik!");
        String inputAgeString = scanner.nextLine();
        int inputAge = 0;
        try {
            inputAge = Integer.parseInt(inputAgeString);
        } catch (Exception e) {
            // TÜHI!!!!!
        }
        System.out.println("Jaga nüüd oma vanus mingi arvuga!");
        String inputDivideString = scanner.nextLine();
        int inputDivide = 0;
        try {
            inputDivide = Integer.parseInt(inputDivideString);
        } catch (Exception e) {
            // LIIGA ÜLDINE, NUMBERFORMATEXCEPTION!!!!!
            e.printStackTrace();
        }
        int age = 0;
        try {
            age = inputAge/inputDivide;
        } catch (Exception e) {
            Logger logger = Logger.getLogger(Example.class.getName());
            FileHandler fh;
            try {
                SimpleFormatter sf = new SimpleFormatter();
                fh = new FileHandler("src\\main\\java\\w09_stream\\" +
                        "mylog.txt");
                fh.setFormatter(sf);
                logger.addHandler(fh);
            } catch (IOException ex) {
                System.out.println("SIIN KA EXCEPTION?");
            }
            throw e;
        }
        checkAge(age);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("EI OLE LUBATUD - Sa pole 18 aastat täis.");
        }
        else {
            System.out.println("LUBATUD - Oled piisavalt vana!");
        }
    }
}
