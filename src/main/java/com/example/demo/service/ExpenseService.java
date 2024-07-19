package com.example.demo.service;

import com.example.demo.InputReader;
import com.example.demo.config.MongoDBConnector;
import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bson.Document;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

@Service
public class ExpenseService {
    private final MongoCollection<Document> collection;

    public ExpenseService() {
        collection = MongoDBConnector.getDatabase().getCollection("expenses");
    }

    public boolean addExpense(String userId, InputReader inputReader) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter category:");
            String category = inputReader.nextLine();
            System.out.println("Enter amount:");
            double amount = inputReader.nextDouble();
            inputReader.nextLine(); // consume newline
            System.out.println("Enter description:");
            String description = inputReader.nextLine();
            System.out.println("Enter date (YYYY-MM-DD):");
            String dateInput = inputReader.nextLine();

            LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);

            Document doc = new Document("userId", userId)
                    .append("category", category)
                    .append("amount", amount)
                    .append("date", date.toString())
                    .append("description", description);

            collection.insertOne(doc);
            System.out.println("Expense added!");
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    private void displayExpenses(List<Document> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        IntStream.range(0, expenses.size())
                .forEach(i -> {
                    Document exp = expenses.get(i);
                    System.out.printf("%d. %s | %s | $%.2f | %s | %s%n",
                            i + 1,
                            exp.getString("category"),
                            exp.getString("date"),
                            exp.getDouble("amount"),
                            exp.getString("description"),
                            exp.getObjectId("_id"));
                });
    }

    public void readExpenses(String userId) {
        List<Document> expenses = collection.find(Filters.eq("userId", userId)).into(new ArrayList<>());
        displayExpenses(expenses);
    }

    public boolean updateExpense(String userId, InputReader inputReader) {
        try {
            List<Document> expenses = collection.find(Filters.eq("userId", userId)).into(new ArrayList<>());
            displayExpenses(expenses);

            System.out.println("Select an expense number to update:");
            int choice = inputReader.nextInt();
            inputReader.nextLine(); // consume newline

            if (choice < 1 || choice > expenses.size()) {
                System.out.println("Invalid choice!");
                return false;
            }

            Document selectedExpense = expenses.get(choice - 1);
            System.out.println("Enter new category:");
            String category = inputReader.nextLine();
            System.out.println("Enter new amount:");
            double amount = inputReader.nextDouble();
            inputReader.nextLine(); // consume newline
            System.out.println("Enter new description:");
            String description = inputReader.nextLine();
            System.out.println("Enter new date (YYYY-MM-DD):");
            String dateInput = inputReader.nextLine();

            LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);

            Bson updates = Updates.combine(
                    Updates.set("category", category),
                    Updates.set("amount", amount),
                    Updates.set("date", date.toString()),
                    Updates.set("description", description)
            );

            collection.updateOne(Filters.eq("_id", selectedExpense.getObjectId("_id")), updates);
            System.out.println("Expense updated!");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteExpense(String userId, InputReader inputReader) {
        try {
            List<Document> expenses = collection.find(Filters.eq("userId", userId)).into(new ArrayList<>());
            displayExpenses(expenses);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select an expense number to delete:");
            int choice = inputReader.nextInt();

            if (choice < 1 || choice > expenses.size()) {
                System.out.println("Invalid choice!");
                return false;
            }

            Document selectedExpense = expenses.get(choice - 1);
            collection.deleteOne(Filters.eq("_id", selectedExpense.getObjectId("_id")));
            System.out.println("Expense deleted!");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void generateReport(String userId, InputReader inputReader) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select report filters ");
        System.out.println("1. month, year and category");
        System.out.println("2. month and year ");
        System.out.println("3. category");
        int choice = inputReader.nextInt();
        inputReader.nextLine();
        String[] selections = new String[]{};
        if(choice == 1){
            selections = new String[]{"month", "year", "category"};
        }
        else if(choice == 2){
            selections = new String[]{"month", "year"};
        }
        else if (choice == 3) {
            selections = new String[]{"category"};
        }
        else {
            System.out.println("Invalid Input");
            return;
        }

        List<Bson> filters = new ArrayList<>();
        filters.add(Filters.eq("userId", userId));

        for (String selection : selections) {
            switch (selection.trim().toLowerCase()) {
                case "month":
                    System.out.println("Enter month (MM):");
                    String month = inputReader.nextLine();
                    filters.add(Filters.regex("date", "-"+month+"-"));
                    break;
                case "year":
                    System.out.println("Enter year (YYYY):");
                    String year = inputReader.nextLine();
                    filters.add(Filters.regex("date", "^"+year+"-"));
                    break;
                case "category":
                    System.out.println("Enter category:");
                    String category = inputReader.nextLine();
                    filters.add(Filters.eq("category", category));
                    break;
                default:
                    System.out.println("Invalid selection: " + selection);
                    return;
            }
        }

        Bson finalFilter = Filters.and(filters);
        List<Document> reportExpenses = collection.find(finalFilter).into(new ArrayList<>());
        displayExpenses(reportExpenses);
    }

//    @Autowired
//    private ExpenseRepository expenseRepository;
//
//    public List<Expense> getAllExpenses(String userId) {
//        return expenseRepository.findByUserId(userId);
//    }
//
//    public Expense addExpense(Expense expense) {
//        return expenseRepository.save(expense);
//    }
//
//    public Expense updateExpense(Expense expense) {
//        return expenseRepository.save(expense);
//    }
//
//    public void deleteExpense(String expenseId) {
//        expenseRepository.deleteById(expenseId);
//    }
}
