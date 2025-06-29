import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class DocumentServiceTest {

    @Test
    public void testInteractionOrderWithOutput() {
        // Step 1: Create mock
        Printer mockPrinter = mock(Printer.class);

        // Step 2: Call methods via service
        DocumentService service = new DocumentService(mockPrinter);
        service.printDocument();  // This will print output to the console

        // Step 3: Verify interaction order
        InOrder inOrder = inOrder(mockPrinter);
        inOrder.verify(mockPrinter).start();
        inOrder.verify(mockPrinter).print("This is the document content.");
        inOrder.verify(mockPrinter).end();

        // Step 4: Confirm test ran
        System.out.println("✅ Order of interactions verified successfully!");
    }
}
