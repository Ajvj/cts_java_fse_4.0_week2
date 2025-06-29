import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskCompletesInTime() {
        System.out.println("3. Starting timeout test");

        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(500), tester::performTask);

        System.out.println("4. Timeout test passed");
    }
}
