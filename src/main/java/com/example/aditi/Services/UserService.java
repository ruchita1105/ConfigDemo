package com.example.aditi.Services;


import com.example.aditi.Entity.User;
import com.example.aditi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update user
    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
