import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testFindUserById_UserNotFound() {
        UserService service = new UserServiceImpl();

        UserNotFoundException exception = assertThrows(
                UserNotFoundException.class,
                () -> service.findUserById(100L)
        );

        System.out.println("Exception Message: " + exception.getMessage());
        assertEquals("User with ID 100 not found.", exception.getMessage());
    }
}
