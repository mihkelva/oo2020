package w04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fridge fridgeSamsung = new Fridge();
        Warehouse warehouse = new Warehouse();
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("banana");
        fruits.add("kiwi");

        fridgeSamsung.setProducts(fruits);
        System.out.println(fridgeSamsung.getProducts());

        Fridge fridgeBosh = new Fridge();

        List allDaFridges = new ArrayList();
        allDaFridges.add(fridgeSamsung);
        allDaFridges.add(fridgeBosh);
        warehouse.setFridges(allDaFridges);
        System.out.println(warehouse.getFridges().size());
    }
}
