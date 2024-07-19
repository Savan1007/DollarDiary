package com.example.demo.service;
import com.example.demo.DemoApplication;
import com.example.demo.InputReader;
import com.example.demo.config.MongoDBConnector;
import com.mongodb.client.ClientSession;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ExpenseServiceTest {
//    private MongoCollection<Document> expenseCollection;
//    private ExpenseService expenseService;
//
//    @BeforeEach
//    public void setUp() {
//        MongoDatabase database = MongoDBConnector.getDatabase();
//        expenseCollection = mock(MongoCollection.class);
//        expenseService = new ExpenseService();
//    }

    @Mock
    private MongoCollection<Document> expenseCollection;

    @Mock
    private UserService userService;

    @Mock
    private InputReader inputReader;

    @InjectMocks
    private ExpenseService expenseService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testAddExpense() {
//        String input = "bills\n50.0\nphone\n2024-07-18\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        when(inputReader.nextLine()).thenReturn("bills", "","phone", "2024-07-15");
        when(inputReader.nextDouble()).thenReturn(50.0);


        assertTrue(expenseService.addExpense("userId123", inputReader));

    }

    @Test
    public void testAddExpenseFalse() {
//        String input = "bills\n50.0\n2024-07-18\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextLine()).thenReturn("bills", "", "2024-07-15");
        when(inputReader.nextDouble()).thenReturn(50.0);

        assertFalse(expenseService.addExpense("userId123", null));

    }

    @Test
    public void testReadExpenses() {
        List<Document> expenses = new ArrayList<>();
        expenses.add(new Document("userId", "userId123")
                .append("category", "grocery")
                .append("amount", 100.0));

        FindIterable<Document> findIterable = mock(FindIterable.class);
        when(findIterable.into(any())).thenAnswer(invocation -> {
            List<Document> list = invocation.getArgument(0);
            list.addAll(expenses);
            return list;
        });

        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);

        expenseService.readExpenses("userId123");

//        verify(expenseCollection, times(1)).find(any(Bson.class));
    }

    @Test
    public void testUpdateExpense() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "1\nentertainment\n150\nmovie\n2023-07-01\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        when(inputReader.nextInt()).thenReturn(1);
        when(inputReader.nextLine()).thenReturn("bills", "","phone", "2024-07-15");
        when(inputReader.nextDouble()).thenReturn(50.0);

        assertTrue(expenseService.updateExpense("userId123", inputReader));

    }

    @Test
    public void testUpdateExpenseFalse() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "0\nentertainment\n150\nmovie\n2023-07-01\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        when(inputReader.nextInt()).thenReturn(0);
        when(inputReader.nextLine()).thenReturn("bills", "","phone", "2024-07-15");
        when(inputReader.nextDouble()).thenReturn(50.0);

        assertFalse(expenseService.updateExpense("userId123", inputReader));

    }

    @Test
    public void testUpdateExpenseError() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "1\n150\nmovie\n2023-07-01\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        when(inputReader.nextInt()).thenReturn(1);
        when(inputReader.nextLine()).thenReturn("bills", "", "2024-07-15");
        when(inputReader.nextDouble()).thenReturn(50.0);
        assertFalse(expenseService.updateExpense("0", inputReader));

    }

    @Test
    public void testDeleteExpense() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "1\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
        when(inputReader.nextInt()).thenReturn(1);

        assertTrue(expenseService.deleteExpense("userId123", inputReader));

    }

    @Test
    public void testDeleteExpenseFalse() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "0\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(0);
        assertFalse(expenseService.deleteExpense("userId123", inputReader));

    }

    @Test
    public void testDeleteExpenseError() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0);
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "1\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(1);
        assertFalse(expenseService.deleteExpense("0", inputReader));

    }

    @Test
    public void testGenerateReport1() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0)
//                .append("date", "2023-06-15");
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "1\n06\n2023\ngrocery\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(1);
        when(inputReader.nextLine()).thenReturn("07", "2024", "bills");

        expenseService.generateReport("userId123", inputReader);

    }

    @Test
    public void testGenerateReport2() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0)
//                .append("date", "2023-06-15");
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "2\n06\n2023\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(2);
        when(inputReader.nextLine()).thenReturn("07", "2024");

        expenseService.generateReport("userId123", inputReader);

    }

    @Test
    public void testGenerateReport3() {
//        List<Document> expenses = new ArrayList<>();
//        Document expense = new Document("_id", "expenseId123")
//                .append("userId", "userId123")
//                .append("category", "grocery")
//                .append("amount", 100.0)
//                .append("date", "2023-06-15");
//        expenses.add(expense);
//
//        FindIterable<Document> findIterable = mock(FindIterable.class);
//        when(findIterable.into(any())).thenAnswer(invocation -> {
//            List<Document> list = invocation.getArgument(0);
//            list.addAll(expenses);
//            return list;
//        });
//
//        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);
//
//        String input = "3\ngrocery\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(3);
        when(inputReader.nextLine()).thenReturn("bills");

        expenseService.generateReport("userId123", inputReader);

    }

    @Test
    public void testGenerateReport4() {
        List<Document> expenses = new ArrayList<>();
        Document expense = new Document("_id", "expenseId123")
                .append("userId", "userId123")
                .append("category", "grocery")
                .append("amount", 100.0)
                .append("date", "2023-06-15");
        expenses.add(expense);

        FindIterable<Document> findIterable = mock(FindIterable.class);
        when(findIterable.into(any())).thenAnswer(invocation -> {
            List<Document> list = invocation.getArgument(0);
            list.addAll(expenses);
            return list;
        });

        when(expenseCollection.find(any(Bson.class))).thenReturn(findIterable);

        String input = "4\n06\n2023\ngrocery\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        when(inputReader.nextInt()).thenReturn(4);
        when(inputReader.nextLine()).thenReturn("07", "2024", "bills");

        expenseService.generateReport("userId123", inputReader);

    }

}
