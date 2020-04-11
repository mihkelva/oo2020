package w08_alamklassid.abstract_classes;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.howMyDayStarts();

        System.out.println();

        Child child2 = new Child();
        child2.eat = "Yoghurt";
        child2.travel = "Train";
        child2.howMyDayStarts();
    }
}
