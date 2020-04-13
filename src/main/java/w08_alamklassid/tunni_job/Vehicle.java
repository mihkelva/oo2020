package w08_alamklassid.tunni_job;

public abstract class Vehicle {
    public void drive(){
        System.out.println("Driving... wrrrn...wrrrn..");
    }

    public abstract void turnLeft();
    public abstract void letPeopleIn();
    public abstract void checkSafety();
}
