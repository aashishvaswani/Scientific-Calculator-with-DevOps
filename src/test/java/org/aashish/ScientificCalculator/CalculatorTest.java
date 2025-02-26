package org.aashish.ScientificCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testFindSquareRoot() {
        assertEquals(5.0, calc.squareRoot(25), 0.001);
        assertEquals(1.414, calc.squareRoot(2), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-9), "Square root of negative number should throw error.");
    }

    @Test
    void testComputeFactorial() {
        assertEquals(6, calc.factorial(3));
        assertEquals(1, calc.factorial(1));
        assertEquals(1, calc.factorial(0)); // Factorial of 0 is always 1
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-5), "Negative numbers should not have factorial.");
    }

    @Test
    void testCalculateLog() {
        assertEquals(2.302, calc.naturalLog(10), 0.001);
        assertEquals(1.609, calc.naturalLog(5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calc.naturalLog(0), "Log of zero is undefined.");
        assertThrows(IllegalArgumentException.class, () -> calc.naturalLog(-1), "Log of negative number should throw an error.");
    }

    @Test
    void testExponentiation() {
        assertEquals(16, calc.power(2, 4), 0.001);
        assertEquals(1, calc.power(7, 0), 0.001);
        assertEquals(0.125, calc.power(2, -3), 0.001);
    }
}
