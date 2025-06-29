import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {
        // Step 1: Create mocks
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Step 2: Stub the read() method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Step 3: Inject mocks into service
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Step 4: Call the method and verify
        String result = fileService.processFile();

        // Step 5: Assertion
        assertEquals("Processed Mock File Content", result);

        // Step 6: Verify that write() was called with expected content
        verify(mockFileWriter).write("Processed Mock File Content");
    }
}
