package w14_seminar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html

    // Exception on error handlem-miseks, et programm ei peatuks kui ta saab vea, vaid läheb edasi
    // Vajalikkus: programmeerija ei suuda ette näha kõiki ootamatuid asju mis võivad koodis juhtuda
    //          ja seega on tähtis, et kõik mis võivad programmi peatada, peab püüdma.

    //          Saame veenduda, et koodis on samad sisendid, mida me ootame.

    // Lisaks - võimalik genereerida lihtsaid, selgelt loetavaid error messageid, mitte suurt veateadet
    //          ja leiame õige koha, kus on viga, mitte ei viska kogu koodile veateaded,
    //          Saame teada täpsemalt, mis vea põhjustas ja mis-kus juhtus

    public static void main(String[] args) {
        System.out.println("Sisesta oma vanus suuremana kui tegelik!");
        int inputAge = getInputAge();
        System.out.println("Jaga nüüd oma vanus mingi arvuga!");
        int inputDivide = getInputAge();
        int age = 0;
        try {
            age = inputAge/inputDivide;
        } catch (Exception e) {
            System.out.println("Jagatud 0-ga");
            e.printStackTrace();
        }
        checkAge(age);
    }

    private static int getInputAge() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String inputAgeString = scanner.nextLine();
        int inputAge = 0;
        try {
            inputAge = Integer.parseInt(inputAgeString);
        } catch (NumberFormatException e) {
            System.out.println("Numbri asemel täht");
            e.printStackTrace();
        }
        return inputAge;
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
