package w06_liides.Homework;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Sõidan");
    }

    @Override
    public void steer() {
        System.out.println("Keeran rooli");
    }

    @Override
    public void brake() {
        System.out.println("Pidurdan");
    }
}
