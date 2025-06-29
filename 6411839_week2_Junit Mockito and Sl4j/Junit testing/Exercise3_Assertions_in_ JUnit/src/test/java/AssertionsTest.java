

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Calculations
        int sum = 2 + 3;
        int a = 5;
        int b = 3;

        // Print values to console
        System.out.println("Sum: " + sum); // Output: 5
        System.out.println("Is 5 > 3? " + (a > b)); // Output: true
        System.out.println("Is 5 < 3? " + (a < b)); // Output: false
        System.out.println("Null value: " + null);
        System.out.println("Non-null object: " + new Object());

        // Assertions
        assertEquals(5, sum);
        assertTrue(a > b);
        assertFalse(a < b);
        assertNull(null);
        assertNotNull(new Object());
    }
}


