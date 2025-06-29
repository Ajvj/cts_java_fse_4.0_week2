package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Init mocks
    }

    @Test
    void testGetUserById_ReturnsUser_WhenFound() {
        Long id = 1L;
        User mockUser = new User(id, "Ajay");

        when(userRepository.findById(id)).thenReturn(Optional.of(mockUser));

        User result = userService.getUserById(id);

        assertNotNull(result);
        assertEquals("Ajay", result.getName());
        assertEquals(id, result.getId());

        verify(userRepository, times(1)).findById(id);
    }

    @Test
    void testGetUserById_ReturnsNull_WhenNotFound() {
        Long id = 99L;

        when(userRepository.findById(id)).thenReturn(Optional.empty());

        User result = userService.getUserById(id);

        assertNull(result);
        verify(userRepository, times(1)).findById(id);
    }
}
