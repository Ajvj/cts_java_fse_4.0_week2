import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class OddCheckerTest {

    private final OddChecker checker = new OddChecker();

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testOddNumbers(int number) {
        System.out.println("Testing odd number: " + number);
        assertTrue(checker.isOdd(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testEvenNumbers(int number) {
        System.out.println("Testing even number (should be false): " + number);
        assertFalse(checker.isOdd(number));
    }
}