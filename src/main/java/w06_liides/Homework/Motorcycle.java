package w06_liides.Homework;

public class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Tõmban esiotsa");
    }

    @Override
    public void steer() {
        System.out.println("Keeran lenksu");
    }

    @Override
    public void brake() {
        System.out.println("Pidurdan");
    }
}
