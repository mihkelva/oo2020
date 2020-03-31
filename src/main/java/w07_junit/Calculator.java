package w07_junit;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    private String name;
    private String contact;
    private int[] numbers = new int[]{1,2,3};

    public Calculator(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public String getContact(){
        return this.contact;
    }

    public int maxValue(int a, int b){
        return a > b ? a : b;
    }



    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
