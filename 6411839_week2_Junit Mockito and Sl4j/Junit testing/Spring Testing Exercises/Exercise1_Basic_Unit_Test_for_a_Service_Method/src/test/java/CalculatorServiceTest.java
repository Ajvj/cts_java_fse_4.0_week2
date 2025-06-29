import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        int result1 = calculatorService.add(3, 5);
        System.out.println("3 + 5 = " + result1);
        assertEquals(8, result1);

        int result2 = calculatorService.add(-2, 2);
        System.out.println("-2 + 2 = " + result2);
        assertEquals(0, result2);

        int result3 = calculatorService.add(0, 0);
        System.out.println("0 + 0 = " + result3);
        assertEquals(0, result3);
    }
}
