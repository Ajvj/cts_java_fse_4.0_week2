import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class ActivityServiceTest {

    @Test
    public void testVoidMethodWithOutput() {
        Logger mockLogger = mock(Logger.class);
        ActivityService service = new ActivityService(mockLogger);

        // Call the method
        service.performAction("Ajay");

        // Capture and print the argument passed to the void method
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mockLogger).logAction(captor.capture());
        System.out.println("Logged: " + captor.getValue());

        // Also verify exact argument
        verify(mockLogger).logAction("Action performed by Ajay");
    }
}
