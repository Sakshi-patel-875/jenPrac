package junittesting;

import org.junit.Test;
import static org.junit.Assert.*;
import junittesting.calculator;

public class CalculatorTest {
	calculator calc = new calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    
    @Test
    public void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }
    
    @Test
    public void testSubtract() {
      assertEquals(5, calc.subtract(10, 5));
    }
}
