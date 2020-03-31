package w06_liides;

public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Hääl!");
    }

    @Override
    public void eat() {
        System.out.println("Söön liha");
    }

    @Override
    public void sleep() {
        System.out.println("Magan magusalt");
    }

    @Override
    public void beSneaky() {
        System.out.println("Hiilin lalalala");
    }

    @Override
    public void lookAround() {
        System.out.println("Vaatan ringi");
    }

    @Override
    public void attack() {
        System.out.println("Ründan jänest");
    }

    @Override
    public void defend() {
        System.out.println("Jooksen püssipaugu eest");
    }
}
