package w05_kontrolltoo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algarvud {
    public static void main(String[] args) {
        System.out.println("Kahendsüsteemist kümnendsüsteemi teisendamine! \n" +
                "Sisesta soovitud kuni 10 kohaline arv " +
                "binaarsel kujul ja tagastan sulle kümnendsüsteemi arvu: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputChars = input.split("");

        Map binaryMap = new HashMap();
        int binaryAmount = 1;

        boolean binary = true;
        int decimalValue = 0;

        if(inputChars.length > 10){
            System.out.println("Arv ei tohi olla rohkem kui kümnekohaline!");
        } else {
            for (int i = inputChars.length - 1; i >= 0; i--) {
                if (!inputChars[i].equals("0") && !inputChars[i].equals("1")) {
                    binary = false;
                    break;
                };
                if (inputChars[i].equals("1")) {
                    binaryMap.put(i+1, binaryAmount);
                };
                binaryAmount *= 2;
            }

            if(!binary){
                System.out.println("Sisestatud arv ei koosne nullidest ja ühtedest!");
            } else {
                decimalValue = Integer.parseInt(input, 2);
                System.out.println("Sinu sisestatud arv kümnendsüsteemis: " + decimalValue);
                if(binaryMap.size() > 0){
                    System.out.println("Binaarses arvus on ühtesid kokku " + binaryMap.size() + ". Nende väärtused on järgmised:");
                    binaryMap.forEach((key, value) -> System.out.printf("%d. kohal asuva 1-e väärtus - %d %n", key, value));
                }
            }
        }
    }
}
