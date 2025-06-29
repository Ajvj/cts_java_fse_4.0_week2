import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    private final EvenChecker evenChecker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12})
    void testIsEven_WithEvenNumbers_ReturnsTrue(int number) {
        System.out.println("Testing even number: " + number);
        assertTrue(evenChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11})
    void testIsEven_WithOddNumbers_ReturnsFalse(int number) {
        System.out.println("Testing odd number: " + number);
        assertFalse(evenChecker.isEven(number));
    }
}
