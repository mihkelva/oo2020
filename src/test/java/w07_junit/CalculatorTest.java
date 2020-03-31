package w07_junit;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    private static  Calculator calculator;
    private static String name = "Mihkel";
    private static Calculator app;

    @BeforeClass
    public static void initiateApp(){
        calculator = new Calculator(name);
        app = new Calculator("Pähkel");
    }

    @Test
    public void appHasCorrectName(){
        assertTrue(calculator.getName().equals(name));
    }

    @Test
    public void getMaxValue() {
        assertEquals("Get max value", 10, calculator.maxValue(4,10));
    }

    @Test
    public void shouldAnswerWithTrue() {
       assertFalse(calculator.maxValue(1,2)!=2);
    }

    @Test
    public void appNameisSame(){
        assertSame("Pähkel", app.getName());
    }

    @Test
    public void appContactIsNull(){
        assertNull(app.getContact());
    }

    @Test
    public void appNameIsNotNull(){
        assertNotNull(app.getName());
    }

    @Test
    public void appNameIsNotEqualToCalculatorName(){
        assertNotEquals(app.getName(), calculator.getName());
    }

    @Test
    public void appObjectIsNotCalculatorObject(){
        assertNotSame(app, calculator);
    }

    @Test
    public void nameIsMihkel(){
        assertThat(name, is("Mihkel"));
    }

    @Test
    public void numbersEqualsArray(){
        assertArrayEquals(calculator.getNumbers(),new int[]{1,2,3});
    }

    @Test
    public void oneEqualsTwo() {
        assertEquals("two equals two",2,2);
    }
}
