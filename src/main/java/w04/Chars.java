package w04;
import java.lang.Math;


public class Chars {
    public static void main(String[] args) {

        String paragraph = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        // Lugeda kokku kõik tähed
        int sum = 0;
        for(int i = 0; i < paragraph.length(); i++) {
            sum++;
        }
        System.out.println(sum);

        // Lugeda spetsiifiline täht
        int letterCount = 0;
        String letterToBeFind = "l";
        int index = paragraph.indexOf(letterToBeFind);
        while (index != -1) {
            letterCount++;
            index = paragraph.indexOf(letterToBeFind, index + 1);
        }
        System.out.println(letterCount);

        // Randomiga muuta mingid tähed suureks ja väikseks
        String letter = "";
        StringBuilder sentenceBack = new StringBuilder();
        for(int i = 0; i < paragraph.length(); i++) {
            double rand = Math.random();
            letter = paragraph.substring(i,i+1);
            if(rand>0.5){
               letter = letter.toLowerCase();
            } else {
               letter = letter.toUpperCase();
            }
            sentenceBack.append(letter);
        }
        System.out.println(sentenceBack);


        // Mingi lause, teeme mingi nihke sisse. 65-A, 67-C , arusaamatu tekst. Nihe on teada. Koodiga on võimalik tagasi nihutada
        String shiffer = cipher("Hello", 2);
        System.out.println(shiffer);
        String back = cipher(shiffer,-2);
        System.out.println(back);



        // Miinimumi-maksimumi leidmine. Anname sisse suvalise massiivi (ka tühi võib olla) ning kõige suurem ja väiksem väärtus (ka miinusega võib olla)

        int[] numbers = new int[] {5,10,7,-1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int positsioon = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
                positsioon++;
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.printf("Maksimaalne väärtus on %d (indeksiga %d) ja minimaalne väärtus on %d %n", max, positsioon, min);
    }



    static String cipher(String sentence, int shift){
        String cipher = "";
        for(int i = 0; i < sentence.length(); i++){
            char character = (char)(sentence.charAt(i) + shift);
            if (character > 'z')
                cipher += (char)(sentence.charAt(i) - (26-shift));
            else
                cipher += (char)(sentence.charAt(i) + shift);
        }
        return cipher;
    }
}
