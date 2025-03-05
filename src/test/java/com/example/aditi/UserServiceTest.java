package com.example.aditi;

import com.example.aditi.Entity.User;
import com.example.aditi.Services.UserService;
import com.example.aditi.repository.UserRepository;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;//mocked userRepository

    @InjectMocks
    private UserService userService;
    //inject mock repo into userservice

    private User user1,user2;

    @BeforeEach
    void setUP(){
        user1 = new User(1L,"Smita Agrwal","smitao7@gmail.com","India");
        user2 = new User(2L,"Priyanka Patil","priyankapatil08@gmail.com","USA");





    }
}
