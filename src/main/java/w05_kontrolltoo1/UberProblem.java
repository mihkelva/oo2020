package w05_kontrolltoo1;

public class UberProblem {
    public static void main(String[] args) {
        int[] uberArray = new int[]{3,2,1};
        int[] newArray = new int[uberArray.length];

        for (int i = 0; i < uberArray.length-1; i++) {
                newArray[i] = uberArray[uberArray.length-i-1] * uberArray[uberArray.length-i-2];
        }

        for (int i = uberArray.length; i > 1; i--) {
            System.out.println(uberArray[uberArray.length-i]);
            newArray[uberArray.length-i] = uberArray[uberArray.length-i] * uberArray[uberArray.length-i+1];
        }

        System.out.println();

        for (int value : newArray) {
            System.out.println(value);
        }

    }
}
