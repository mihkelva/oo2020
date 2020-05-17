package w09_stream.kodused;

import w09_stream.Example;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Exception {
    public static void main(String[] args) {
    //    1) Luua 2 olukorda koodis, mis viskaks exceptioni ning try-catch blokiga kinni püüda ja loggida tulemus faili

        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();

        try {
            fh = new FileHandler("src\\main\\java\\w09_stream\\kodused\\" +
                    "mylog_home.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (java.lang.Exception e) {
            logger.warning("Code should never reach here " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            logger.warning("You entered letter instead of number " + e.getMessage());
        }

        try {
            int[] intArray = new int[]{1,2,3};
            for (int i = 0; i < 4; i++) {
                System.out.println(intArray[i]);
            }
        } catch (java.lang.Exception e) {
            logger.warning("For cycle too long " + e.getMessage());
        }

    }

}
