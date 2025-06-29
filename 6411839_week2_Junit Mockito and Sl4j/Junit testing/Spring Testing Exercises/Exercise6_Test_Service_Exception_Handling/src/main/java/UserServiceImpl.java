import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private Map<Long, User> users = new HashMap<>();

    public UserServiceImpl() {
        users.put(1L, new User(1L, "Ajay"));
        users.put(2L, new User(2L, "Vikram"));
    }

    @Override
    public User findUserById(Long id) {
        if (!users.containsKey(id)) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        }
        return users.get(id);
    }
}
