import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-9;
    Calculator calculator = new Calculator();

    @Test
    public void squareRoot_True(){
        assertEquals("True: Square Root of number ", 9.0, calculator.squareRoot(81), DELTA);
        assertEquals("True: Square Root of number ", 4.7958315233127 , calculator.squareRoot(23), DELTA);
        assertEquals("True: Square Root of number ", Double.NaN, calculator.squareRoot(-10), DELTA);
    }

    @Test
    public void squareRoot_False(){
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(18), DELTA);
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(32), DELTA);
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(-16), DELTA);
    }

    @Test
    public void factorial_True(){
        assertEquals("True: Factorial of number for True positive", 24.0, calculator.factorial(4), DELTA);
        assertEquals("True: Factorial of number for True positive", 720.0, calculator.factorial(6), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN, calculator.factorial(-15), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN, calculator.factorial(10.5123), DELTA);
    }

    @Test
    public void factorial_False(){
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(2), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(10), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(-4), DELTA);


    }

    @Test
    public void naturalLog_True(){
        assertEquals("True: Factorial of number for True positive", 11.721669844, calculator.naturalLog(123213), DELTA);
        assertEquals("True: Factorial of number for True positive", 6.67076632085, calculator.naturalLog(789), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN, calculator.naturalLog(-100), DELTA);
    }

    @Test
    public void naturalLog_False(){
        assertNotEquals("False: Factorial of number for False positive", 1,calculator.naturalLog(21243), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1,calculator.naturalLog(231131), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1, calculator.naturalLog(-131123), DELTA);
    }

    @Test
    public void mypower_True(){
        assertEquals("True: Factorial of number for True positive", 256.0, calculator.mypower(2, 8), DELTA);
        assertEquals("True: Factorial of number for True positive", 125,  calculator.mypower(5,3), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN,  calculator.mypower(-12,42.232), DELTA);
    }

    @Test
    public void mypower_False(){
        assertNotEquals("False: Factorial of number for False positive", 1.0,  calculator.mypower(213, 2), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.mypower(96,86), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.mypower(-73,74.3), DELTA);
    }
}
