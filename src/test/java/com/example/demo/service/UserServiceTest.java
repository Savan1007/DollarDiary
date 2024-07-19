package com.example.demo.service;
import com.example.demo.InputReader;
import com.example.demo.config.MongoDBConnector;
import com.mongodb.client.ClientSession;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {
//    private MongoCollection<Document> userCollection;
//    private UserService userService;
//    @Mock
//    private InputReader inputReader;
//    @BeforeEach
//    public void setUp() {
//        MongoDatabase database = MongoDBConnector.getDatabase();
//        userCollection = mock(MongoCollection.class);
//        userService = new UserService();
//    }

    @Mock
    private MongoCollection<Document> userCollection;

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

    @Mock
    private InputReader inputReader;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testSignUp() {
//        String input = "newUser\nnewuser@gmail.com\npassword123\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        userService.signUp(inputReader);

        when(inputReader.nextLine()).thenReturn("","", "");

        assertFalse(userService.signUp(inputReader));
    }

    @Test
    public void testLoginSuccess() {
//        Document user = new Document("_id", "userId123")
//                .append("username", "newUser")
//                .append("password", "password123");
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.first()).thenReturn(user);
//
//        when(userCollection.find(any(Document.class))).thenReturn(findIterable);
//
//        String input = "newUser\npassword123\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        String userId = userService.login(inputReader);
//        assertNotEquals("null", userId);

        when(inputReader.nextLine()).thenReturn("","");

        assertNotEquals(null, userService.login(inputReader));
    }

    @Test
    public void testLoginFailure() {
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.first()).thenReturn(null);
//
//        when(userCollection.find(any(Document.class))).thenReturn(findIterable);
//
//        String input = "nonExistentUser\npassword\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        String userId = userService.login(inputReader);
//        assertNull(userId);

        when(inputReader.nextLine()).thenReturn("123","");

        assertEquals(null, userService.login(inputReader));
    }

}
