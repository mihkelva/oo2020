package w08_alamklassid.tunni_job;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.checkSafety();
        bmw.letPeopleIn();
        bmw.drive();

        System.out.println();

        Plane boeing = new Plane();
        boeing.checkSafety();
        boeing.letPeopleIn();
        boeing.drive();
    }
}
