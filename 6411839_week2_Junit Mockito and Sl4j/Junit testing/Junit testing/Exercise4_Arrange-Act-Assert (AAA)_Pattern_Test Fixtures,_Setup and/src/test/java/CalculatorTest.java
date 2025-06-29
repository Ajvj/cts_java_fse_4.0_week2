import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Setup
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down...");
        calculator = null; // Teardown
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
        System.out.println("Addition Result: " + result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
        System.out.println("Subtraction Result: " + result);
    }
}
