package com.example.demo;

import com.example.demo.service.ExpenseService;
import com.example.demo.service.UserService;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;


//@SpringBootTest
class DemoApplicationTests {

	@Mock
	private UserService userService;

	@Mock
	private ExpenseService expenseService;

	@Mock
	private InputReader inputReader;

	@InjectMocks
	private DemoApplication demoApplication;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testSignUp() {
		when(inputReader.nextInt()).thenReturn(1, 3);
		when(inputReader.nextLine()).thenReturn("", "" , "", "");

		demoApplication.expense(inputReader);

//		verify(userService, times(1)).signUp(inputReader);
	}

	@Test
	public void testLogin() {
		when(inputReader.nextInt()).thenReturn(2, 6, 3);
		when(inputReader.nextLine()).thenReturn("", "", "");
		when(userService.login(inputReader)).thenReturn("userId");

		demoApplication.expense(inputReader);
	}

    @Test
    public void testLoginAndAddExpense() {
        when(inputReader.nextInt()).thenReturn(2, 1, 6, 3);
        when(inputReader.nextLine()).thenReturn("", "", "", "", "", "", "");
        when(inputReader.nextDouble()).thenReturn(50.0);
        when(userService.login(inputReader)).thenReturn("userId");

        demoApplication.expense(inputReader);
    }

    @Test
    public void testLoginAndupdateExpense() {
        when(inputReader.nextInt()).thenReturn(2, 2, 1, 6, 3);
        when(inputReader.nextLine()).thenReturn("", "", "", "", "", "", "");
        when(inputReader.nextDouble()).thenReturn(50.0);
        when(userService.login(inputReader)).thenReturn("userId");

        demoApplication.expense(inputReader);
    }

    @Test
    public void testLoginAndDeleteExpense() {
        when(inputReader.nextInt()).thenReturn(2, 3, 1, 6, 3);
        when(inputReader.nextLine()).thenReturn("", "", "");
        when(userService.login(inputReader)).thenReturn("userId");

        demoApplication.expense(inputReader);
    }

    @Test
    public void testLoginAndReadExpense() {
        when(inputReader.nextInt()).thenReturn(2, 4, 6, 3);
        when(inputReader.nextLine()).thenReturn("", "", "");
        when(userService.login(inputReader)).thenReturn("userId");

        demoApplication.expense(inputReader);
    }

    @Test
    public void testLoginAndGenReport() {
        when(inputReader.nextInt()).thenReturn(2, 5, 3, 6, 3);
        when(inputReader.nextLine()).thenReturn("", "", "", "bills");
        when(userService.login(inputReader)).thenReturn("userId");

        demoApplication.expense(inputReader);
    }

	@Test
	public void testExit() {
		when(inputReader.nextInt()).thenReturn(3);
		when(inputReader.nextLine()).thenReturn("");

		demoApplication.expense(inputReader);

		verify(userService, never()).signUp(inputReader);
		verify(userService, never()).login(inputReader);
	}


	@Test
	void contextLoads() {
	}

}
