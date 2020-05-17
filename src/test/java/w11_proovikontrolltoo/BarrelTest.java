package w11_proovikontrolltoo;

import junit.framework.TestCase;

public class BarrelTest extends TestCase {
    Barrel suhtTuhiVaat = new Barrel(10000, 200);
    Barrel poolTuhiVaat = new Barrel(10000, 5000);
    Barrel taisVaat = new Barrel(10000, 10000);
    Bottle coca = new Bottle(500, "klaas", 100, 0.1,
            new Drink("Coca-cola", 0.01, 0.9 ));

    public void testReturnsFalseIfSuhtTuhi() {
        assertFalse(suhtTuhiVaat.fillBottle(coca));
    }

    public void testReturnsTrueIfPoolTuhi() {
        assertTrue(poolTuhiVaat.fillBottle(coca));
    }

    public void testReturnsTrueIfSuhtTais() {
        assertTrue(taisVaat.fillBottle(coca));
    }

    public void testFillWholeBarrel() {
        assertEquals(20, taisVaat.fillWholeBarrel(coca));
    }
}