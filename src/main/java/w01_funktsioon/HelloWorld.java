public class HelloWorld{

    public static void main(String[] args){
        System.out.println("Hello Wolrd");
 
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println(maxByte);
        System.out.println(minByte);

        int number = 5;
        System.out.println(number++);
        System.out.println(++number);

        if(number<10 || number > 0){
            System.out.println("Jah");
        }

        int counter = 0;

        boolean flag = true;
        while(flag){
            counter++;
            if(counter == 10){
                System.out.println("I'm out");
                flag = false;
            }
        }


        for (int i = 0; i < 10; i++) {
            
        }
        

        int counterTwo = 0;
        do {
            counterTwo++;
        } while (counterTwo == 10);

        int[] numberArray = new int[] {1,2,3,4,5};

        for(int element : numberArray){
            System.out.println(element);
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        String myName = "Raimo";

        System.out.println(myName);

        HelloWorld helloworld = new HelloWorld();

        helloworld.printSomething(10);

        String name = name();
        System.out.println(name);
    }

    static String name(){
        return "Mihkel";
    };

    void printSomething(int number){
        for (int i = 0; i < 5; i++) {
            System.out.println(number += i);
        }
    };

    

}