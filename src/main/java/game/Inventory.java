package game;

import w03_klassikomplekt.Game.Character.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int inventoryMaxSize = 0;
    List<Item> inventory = new ArrayList<>();

    public Inventory(int inventoryMaxSize) {
        this.inventoryMaxSize = inventoryMaxSize;
    }

    void addItem(Item item){
        if (inventory.size() <= inventoryMaxSize){
            inventory.add(item);
            System.out.println(item + " added to inventory");
        } else {
            System.out.println(item + " not added to inventory");
        }
    }
}
