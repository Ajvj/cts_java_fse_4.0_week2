package myapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = MyApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {
        User user = new User();
        user.setName("Ajay");
        userRepository.save(user);

        List<User> result = userRepository.findByName("Ajay");
        assertThat(result).isNotEmpty();
    }
}
