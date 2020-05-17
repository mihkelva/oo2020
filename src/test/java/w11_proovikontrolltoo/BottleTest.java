package w11_proovikontrolltoo;

import junit.framework.TestCase;

public class BottleTest extends TestCase {
    Bottle coca = new Bottle(500, "klaas", 100, 0.1,
            new Drink("Coca-cola", 0.01, 0.9 ));

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetTotalWeight() {
        assertEquals(5.1, coca.getTotalCost());
    }

    public void testGetTotalCost() {
        assertEquals(550.0, coca.getTotalWeight());
    }

}