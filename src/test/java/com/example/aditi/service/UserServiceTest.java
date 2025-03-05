//package com.example.aditi.service;
//
//import com.example.aditi.Entity.User;
//import com.example.aditi.Services.UserService;
//import com.example.aditi.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServiceTest {
//
//    @Mock
//    UserRepository userRepository;
//
//@InjectMocks
//UserService userService;
//
//    @Test
//    void createUserShouldAddCreateUserSuccessfully(){
//        User user=new User();
//        Mockito.when(userRepository.save(user)).thenReturn(user);
//        User addedUser= userService.createUser(user);
//        System.out.println("this is my first unit test");
//    }
//
//}
package com.example.aditi.service;

import com.example.aditi.Entity.User;
import com.example.aditi.Services.UserService;
import com.example.aditi.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void createUserShouldAddCreateUserSuccessfully() {
        // Arrange: Prepare test data
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        // Mock behavior of repository
        when(userRepository.save(user)).thenReturn(user);

        // Act: Call the service method
        User addedUser = userService.createUser(user);

        // Assert: Verify the result
        assertNotNull(addedUser);
        assertEquals(1L, addedUser.getId());
        assertEquals("John Doe", addedUser.getName());
        assertEquals("john.doe@example.com", addedUser.getEmail());

        // Verify that save method was called once
        verify(userRepository, times(1)).save(user);

        System.out.println("Test Passed: User created successfully.");
    }
}
