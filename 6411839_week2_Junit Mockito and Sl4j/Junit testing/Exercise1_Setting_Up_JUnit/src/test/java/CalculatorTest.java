

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        System.out.println("Result of add(10, 5) = " + result);
        assertEquals(15, result);
    }
}
