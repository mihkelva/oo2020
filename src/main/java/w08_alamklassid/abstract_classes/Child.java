package w08_alamklassid.abstract_classes;

public class Child extends Parent {
    public String eat = "Kellogs";
    public String travel = "Car";

    @Override
    public void howMyDayStarts() {
        super.howMyDayStarts();

        System.out.println("I eat " + eat);
        System.out.println("I travel by " + travel);
    }

    @Override
    public void myThinkingProcess() {

    }

    @Override
    public void myLearningProcess() {

    }

    @Override
    public void howILive() {

    }
}
