package w08_alamklassid.tunni_job;

public class Plane extends Vehicle {
    public int wings = 2;
    public String steering = "yoke";
    public int doors = 1;


    public void drive(){
        super.drive();
        checkSafety();
        System.out.println("Going higher!");
    }

    @Override
    public void turnLeft() {
        System.out.println("Moving " + this.steering);
    }

    @Override
    public void letPeopleIn() {
        System.out.println("Landing... opening doors:" + this.doors);
    }

    @Override
    public void checkSafety() {
        System.out.println("Checking...: total wings: " + this.wings);
    }


}
