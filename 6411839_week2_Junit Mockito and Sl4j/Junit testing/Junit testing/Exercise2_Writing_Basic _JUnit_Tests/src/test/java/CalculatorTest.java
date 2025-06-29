import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("Addition result: " + result);  // 👈 This prints output
        assertEquals(5, result);
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(4, 5);
        System.out.println("Multiplication result: " + result);  // 👈 This prints output
        assertEquals(20, result);
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 5);
        System.out.println("Division result: " + result);  // 👈 This prints output
        assertEquals(2, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        System.out.println("Testing divide by zero...");  // 👈 Optional print
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}