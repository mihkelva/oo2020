package w06_liides;

public class Main {
    public static void main(String[] args) {
        String id = "39103155212";
        EstonianID estonianID = new EstonianID();
        System.out.println(estonianID.gender(id));
        System.out.println(estonianID.getMonth(id));
        System.out.println(estonianID.getDay(id));
        System.out.println(estonianID.getYear(id));
        System.out.println(estonianID.getBirthday(id));
        System.out.println(estonianID.getAge(id));
        System.out.println(estonianID.untilNextBirthDay(id));

        System.out.println();

        String finID = "230381-237";
        FinnishID finnishID = new FinnishID();
        System.out.println(finnishID.getDay(finID));
        System.out.println(finnishID.getMonth(finID));
        System.out.println(finnishID.getYear(finID));
        System.out.println(finnishID.getBirthday(finID));
        System.out.println(finnishID.getAge(finID));
        System.out.println(finnishID.untilNextBirthDay(finID));
    }
}
