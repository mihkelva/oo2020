package w11_proovikontrolltoo;

import junit.framework.TestCase;

public class BoxOfBottlesTest extends TestCase {
    BoxOfBottles pudeliKast =
            new BoxOfBottles("Puidukast", 100, 5000, 24,
                new Bottle(500, "Klaas", 100, 0.1,
                    new Drink("Coca-cola", 1.5, 1) ));
    Barrel tuhiVaat = new Barrel(100000, 200);
    Barrel suhtTuhiVaat = new Barrel(100000, 5000);
    Barrel taisVaat = new Barrel(100000, 100000);

    public void testGetTotalWeight() {
        assertEquals(5600.0, pudeliKast.getTotalWeight());
    }

    public void testGetTotalCost() {
        assertEquals(850.1, pudeliKast.getTotalCost());
    }

    public void testFillBoxFromEmptyBarrel() {
        assertEquals(0, pudeliKast.fillBoxFromBarrel(tuhiVaat));
    }

    public void testFillBoxFromHalfEmptyBarrel() {
        assertEquals(10, pudeliKast.fillBoxFromBarrel(suhtTuhiVaat));
    }

    public void testFillBoxFromFullBarrel() {
        assertEquals(24, pudeliKast.fillBoxFromBarrel(taisVaat));
    }
}