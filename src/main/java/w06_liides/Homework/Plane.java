package w06_liides.Homework;

public class Plane implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Lükkan kangi");
    }

    @Override
    public void steer() {
        System.out.println("Muudan kraade");
    }

    @Override
    public void brake() {
        System.out.println("Tõmban kangi");
    }
}
