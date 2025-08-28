package at.campus02.bsd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(7, calculator.add(7, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-4, calculator.subtract(-2, 2));
        assertEquals(7, calculator.subtract(7, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(0, calculator.multiply(7, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-1, calculator.divide(-2, 2));
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    void testFactorial() {
        assertEquals(1, calculator.factorial(1));
        assertEquals(24, calculator.factorial(4));
        assertEquals(0, calculator.factorial(-2));
    }
}
