import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-9;
    Operations operations = new Operations();

    @Test
    public void TrueValue_SquareRoot(){
        assertEquals("True Square Root Value : ", 10.0, operations.squareRoot(100), DELTA);
        assertEquals("True Square Root Value : ", 6.0 , operations.squareRoot(36), DELTA);
        assertEquals("True Square Root Value : ", Double.NaN, operations.squareRoot(-1), DELTA);
    }

    @Test
    public void FalseValue_SquareRoot(){
        assertNotEquals("False Square Root Value : ", 1.0, operations.squareRoot(18), DELTA);
        assertNotEquals("False Square Root Value : ", 1.0, operations.squareRoot(32), DELTA);
        assertNotEquals("False Square Root Value : ", 1.0, operations.squareRoot(-16), DELTA);
    }

    @Test
    public void TrueValue_Factorial(){
        assertEquals("True Factorial Value : ", 24, operations.fact(4), DELTA);
        assertEquals("True Factorial Value : ", 720, operations.fact(6), DELTA);
        assertEquals("True Factorial Value : ", -1, operations.fact(-15), DELTA);
    }

    @Test
    public void FalseValue_Factorial(){
        assertNotEquals("False Factorial Value : ", 1, operations.fact(2), DELTA);
        assertNotEquals("False Factorial Value : ", 1, operations.fact(10), DELTA);
        assertNotEquals("False Factorial Value : ", 1, operations.fact(-4), DELTA);
    }

    @Test
    public void TrueValue_NaturalLog(){
        assertEquals("True Natural Log Value : ", 11.721669844, operations.logbe(123213), DELTA);
        assertEquals("True Natural Log Value : ", 6.67076632085, operations.logbe(789), DELTA);
        assertEquals("True Natural Log Value : ", Double.NaN, operations.logbe(0), DELTA);
    }

    @Test
    public void FalseValue_NaturalLog(){
        assertNotEquals("False Natural Log Value : ", 1, operations.logbe(12000), DELTA);
        assertNotEquals("False Natural Log Value : ", 1, operations.logbe(4200), DELTA);
        assertNotEquals("False Natural Log Value : ", 1, operations.logbe(-2), DELTA);
    }

    @Test
    public void TrueValue_Power(){
        assertEquals("True Exponential Value : ", 256.0, operations.power(2, 8), DELTA);
        assertEquals("True Exponential Value : ", 125.0,  operations.power(5,3), DELTA);
        assertEquals("True Exponential Value : ", Double.NaN,  operations.power(-12,42.232), DELTA);
    }

    @Test
    public void FalseValue_Power(){
        assertNotEquals("False: Factorial of number for False positive", 1.0,  operations.power(213, 2), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, operations.power(96,86), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, operations.power(-73,74.3), DELTA);
    }
}
