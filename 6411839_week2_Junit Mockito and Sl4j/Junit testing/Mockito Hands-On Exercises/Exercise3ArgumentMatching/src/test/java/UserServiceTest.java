import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class UserServiceTest {

    @Test
    public void testSendMessageWithArgumentMatcherAndOutput() {
        // Step 1: Create mock
        Notifier mockNotifier = mock(Notifier.class);

        // Step 2: Inject mock into service and call method
        UserService service = new UserService(mockNotifier);
        service.registerUser("Ajay");

        // Step 3: Capture the actual argument passed
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mockNotifier).sendMessage(captor.capture());

        // Step 4: Print the captured output
        String actualMessage = captor.getValue();
        System.out.println("Message sent: " + actualMessage);

        // Step 5: Also verify it matches expected pattern
        verify(mockNotifier).sendMessage(startsWith("Welcome"));
    }
}
