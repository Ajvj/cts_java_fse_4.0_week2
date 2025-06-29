package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testServiceWithMockRepository() {
        // Step 1: Create mock
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        Service service = new Service(mockRepository);

        // Step 4: Call method under test
        String result = service.processData();

        // Step 5: Assert expected outcome
        assertEquals("Processed Mock Data", result);
    }
}
