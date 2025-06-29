import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApiReturnsNumber() {
        // Step 1: Mock the external API
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method to return a number
        when(mockApi.getData()).thenReturn(42); // return a number

        // Step 3: Inject mock into the service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and check the result
        int result = service.fetchData();
        System.out.println("Output: " + result); // to see output in IntelliJ
        assertEquals(42, result);
    }
}


