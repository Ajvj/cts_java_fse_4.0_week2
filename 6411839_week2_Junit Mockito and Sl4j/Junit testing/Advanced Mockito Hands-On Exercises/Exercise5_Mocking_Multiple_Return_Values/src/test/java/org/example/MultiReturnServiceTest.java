package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {
        // Step 1: Create mock object
        Repository mockRepository = mock(Repository.class);

        // Step 2: Stub method to return different values on consecutive calls
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // Step 3: Use mocked repo in service
        Service service = new Service(mockRepository);

        // Step 4: Call and test results
        String firstResult = service.processData();
        String secondResult = service.processData();

        System.out.println("1st call: " + firstResult);
        System.out.println("2nd call: " + secondResult);

        // Step 5: Assert expected values
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}