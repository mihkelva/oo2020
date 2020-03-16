package w01_funktsioon;

public class HomeworkOne{

    public static void main(String[] args){

        String numberOne = "4";
        String numberTwo = "5";

       String answer = converter(numberOne, numberTwo);
       System.out.println(answer);
    }

       static String converter(String numberOne, String numberTwo){
        int numberOneInt = Integer.parseInt(numberOne);
        int numberTwoInt = Integer.parseInt(numberTwo);
        int sum = numberOneInt * numberTwoInt;
        String stringSum = String.valueOf(sum);
        return stringSum;
    };

}