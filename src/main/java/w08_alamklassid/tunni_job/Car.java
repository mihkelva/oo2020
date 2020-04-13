package w08_alamklassid.tunni_job;

public class Car extends Vehicle {
    public String steering = "wheel";
    public int doors = 4;


    @Override
    public void turnLeft() {
        System.out.println("Turning " + this.steering);
    }

    @Override
    public void letPeopleIn() {
        System.out.println("Opening doors: " + (this.doors - 1));
    }


    @Override
    public void checkSafety() {
        System.out.println("Checking if tires are not slashed...");
    }
}
