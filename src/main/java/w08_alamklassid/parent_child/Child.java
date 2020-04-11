package w08_alamklassid.parent_child;

public class Child extends Parent {

    public Child(String name, String job){
        super(name, job);
        this.isIndependent = false;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("gugu gaga");
    }
}
