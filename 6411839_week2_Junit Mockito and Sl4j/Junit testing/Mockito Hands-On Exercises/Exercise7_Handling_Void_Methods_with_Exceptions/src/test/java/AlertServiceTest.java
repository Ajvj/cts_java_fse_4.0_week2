import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class AlertServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Step 1: Create mock
        Notifier mockNotifier = mock(Notifier.class);

        // Step 2: Stub to throw exception on send()
        doThrow(new RuntimeException("Mocked send failure"))
                .when(mockNotifier)
                .send(anyString());

        // Step 3: Inject mock into service and call method
        AlertService service = new AlertService(mockNotifier);
        service.triggerAlert("Emergency alert!");

        // Step 4: Verify that send() was called
        verify(mockNotifier).send("Emergency alert!");
    }
}
