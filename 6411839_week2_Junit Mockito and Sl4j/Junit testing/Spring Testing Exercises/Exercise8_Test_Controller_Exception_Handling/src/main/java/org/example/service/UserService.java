package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {
    public User getUserById(Long id) {
        if (id == 1) {
            return new User(1L, "Ajay");
        }
        throw new NoSuchElementException("org.example.model.User not found");
    }
}
