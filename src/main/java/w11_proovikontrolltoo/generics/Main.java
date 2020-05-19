package w11_proovikontrolltoo.generics;

public class Main {
    public static void main(String[] args) {
        House maja = new House();
        System.out.println(Generics.getBedrooms(maja));
        System.out.println(Generics.getType(maja));
    }
}
