package w06_liides.Homework;

public class Traffic {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.drive();
        bmw.brake();
        System.out.println();

        Plane boeing = new Plane();
        boeing.steer();
        boeing.drive();
        System.out.println();

        Motorcycle harley = new Motorcycle();
        harley.drive();
        harley.steer();
        System.out.println();
    }
}
