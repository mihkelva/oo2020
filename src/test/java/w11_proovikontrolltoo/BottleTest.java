package w11_proovikontrolltöö;

import junit.framework.TestCase;

public class BottleTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetTotalWeight() {
        Bottle coca = new Bottle(500, "klaas", 100, 0.1,
                new Drink("Coca-cola", 1.1, 0.9 ));
        assertEquals(5, coca.getTotalCost());
    }

    public void testGetTotalCost() {
    }
}