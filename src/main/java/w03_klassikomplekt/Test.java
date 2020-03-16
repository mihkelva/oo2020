package w03_klassikomplekt;

import java.util.ArrayList;
import java.util.List;

public class Test {
    String name;
    String lenght;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(String.valueOf(5));
        list.add(10 + "");

        List<String> list2 = new ArrayList<>();

        for(String name: list){
            System.out.println(name);
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        int arrayLenght = 10;
        int[] intArray = new int[arrayLenght];
        intArray[arrayLenght-1] = 5;

        System.out.println(intArray[4]);

        Test test = new Test();
        test.name = "My w03_klassikomplekt.Test name";
        test.lenght = "30 days";

        Test test2 = new Test();
        test2.name = "My Second w03_klassikomplekt.Test";

        Test[] testArray = new Test[5];

        testArray[4] = new Test();


        List<Test> myList = new ArrayList<>();
    }
}
