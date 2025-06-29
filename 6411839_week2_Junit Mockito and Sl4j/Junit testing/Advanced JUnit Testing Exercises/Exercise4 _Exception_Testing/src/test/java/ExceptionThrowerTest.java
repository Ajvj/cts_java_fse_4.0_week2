import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    void testExceptionIsThrown() {
        System.out.println("2. Starting testExceptionIsThrown()");
        ExceptionThrower thrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException();
        });
        System.out.println("3. Exception was thrown as expected");
    }
}
