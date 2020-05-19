package w09_stream.kodused;

public class Threads extends Thread {
    int numberOfThread ;

    Threads(int number) {
        numberOfThread = number;
        start();
    }

    public void run() {
        if(numberOfThread == 1)
            functionCount();
        else if(numberOfThread == 2)
            functionCountBackwards();
        else if(numberOfThread == 3)
            functionLetters();
        else if(numberOfThread == 4)
            functionLettersBackwards();
    }

    void functionCount() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void functionCountBackwards() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void functionLetters() {
        int a = 107;
        for (int i = 10; i >= 0; i--) {
            String charact = Character.toString ((char) a);
            System.out.println(charact);
            a--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void functionLettersBackwards() {
        int a = 97;
        for (int i = 0; i < 11; i++) {
            String charact = Character.toString ((char) a);
            System.out.println(charact);
            a++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Threads(1);
        Thread t2 = new Threads(2);
        Thread t3 = new Threads(3);
        Thread t4 = new Threads(4);
    }
}
