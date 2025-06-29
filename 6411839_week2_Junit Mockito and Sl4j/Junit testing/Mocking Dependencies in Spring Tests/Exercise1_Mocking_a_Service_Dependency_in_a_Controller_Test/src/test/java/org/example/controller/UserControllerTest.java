package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testGetUser_ReturnsUser_WhenUserExists() {
        Long userId = 1L;
        User mockUser = new User(userId, "Ajay");

        when(userService.getUserById(userId)).thenReturn(mockUser);

        ResponseEntity<User> response = userController.getUser(userId);

        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals("Ajay", response.getBody().getName());
        assertEquals(userId, response.getBody().getId());

        verify(userService, times(1)).getUserById(userId);
    }

    @Test
    void testGetUser_Returns404_WhenUserNotFound() {
        Long userId = 99L;

        when(userService.getUserById(userId)).thenReturn(null);

        ResponseEntity<User> response = userController.getUser(userId);

        assertEquals(404, response.getStatusCodeValue());
        assertNull(response.getBody());

        verify(userService, times(1)).getUserById(userId);
    }
}
