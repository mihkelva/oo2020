package w08_alamklassid.parent_child;

import w08_alamklassid.parent_child.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Gugu", "Going to school");
        System.out.println(
                child.armSlots + " " +
                child.legSlots
                );

        System.out.println(child.name + " " + child.job + " " + child.isIndependent);

        child.speak();
    }
}
