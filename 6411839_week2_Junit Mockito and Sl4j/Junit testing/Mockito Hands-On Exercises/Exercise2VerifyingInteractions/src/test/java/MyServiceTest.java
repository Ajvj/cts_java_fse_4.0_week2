import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);


        when(mockApi.getData()).thenReturn(52);


        MyService service = new MyService(mockApi);
        service.fetchData();


        verify(mockApi).getData();
    }
}

