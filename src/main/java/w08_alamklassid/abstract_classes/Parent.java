package w08_alamklassid.abstract_classes;

public abstract class Parent {

    public String name = "Peter";
    public String job = "Developer";

    public void speak(){
        System.out.println("My name is " + this.name + " and my job is " + this.job);
    }

    public abstract void myThinkingProcess();
    public abstract void myLearningProcess();
    public abstract void howILive();

    public void howMyDayStarts(){
        System.out.println("I wake up");
    }
}
