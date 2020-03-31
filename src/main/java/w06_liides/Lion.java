package w06_liides;

public class Lion implements Animal {
    @Override
    public void speak() {
        System.out.println("Rawwwr");
    }

    @Override
    public void eat() {
        System.out.println("Söön sebra");
    }

    @Override
    public void sleep() {
        System.out.println("Magan kuninglikult");
    }

    @Override
    public void beSneaky() {
        System.out.println("Hiilin tipa-tapa");
    }

    @Override
    public void lookAround() {
        System.out.println("Vaatan ringi");
    }

    @Override
    public void attack() {
        System.out.println("Ründan sebra");
    }

    @Override
    public void defend() {
        System.out.println("Kaitsen küttide eest");
    }
}
