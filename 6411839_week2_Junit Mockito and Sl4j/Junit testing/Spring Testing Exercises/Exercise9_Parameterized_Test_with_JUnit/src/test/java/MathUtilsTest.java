import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEven_WithEvenNumbers(int number) {
        System.out.println("Checking if " + number + " is even");
        assertTrue(MathUtils.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEven_WithOddNumbers(int number) {
        System.out.println("Checking if " + number + " is odd");
        assertFalse(MathUtils.isEven(number), number + " should be odd");
    }
}
