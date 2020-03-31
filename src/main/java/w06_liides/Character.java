package w06_liides;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Character implements CharacterBehaviour {


    @Override
    public void move() {
        System.out.println("I moved");
    }

    @Override
    public void ChangeDirection() {
        System.out.println("Direction changed");
    }

    @Override
    public void speak() {
        System.out.println("I spoke");
    }

    @Override
    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

    }
}
