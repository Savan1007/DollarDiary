package com.example.demo.service;

import com.example.demo.InputReader;
import com.example.demo.config.MongoDBConnector;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.mongodb.client.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;

import org.bson.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//@Service
public class UserService {

    private final MongoCollection<Document> userCollection;

    public UserService() {
        userCollection = MongoDBConnector.getDatabase().getCollection("users");
    }


    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    private final Map<String, User> users = new HashMap<>();

    public boolean signUp(InputReader inputReader) {
        try{
            Scanner scanner = new Scanner((System.in));
            System.out.println("Enter username:");
            String username = inputReader.nextLine();
            System.out.println("Enter email:");
            String email = inputReader.nextLine();
            System.out.println("Enter password:");
            String password = inputReader.nextLine();

            Document existingUser = userCollection.find(new Document("username", username)).first();
            if (existingUser != null) {
                System.out.println("Username already exists!");
                return false;
            }

//            Document userDoc = new Document("username", username)
//                    .append("password", password).append("email", email); // Hash password for security

            userCollection.insertOne(new Document("username", username)
                    .append("password", password).append("email", email));
            System.out.println("Sign up successful!");
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public String login(InputReader inputReader) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = inputReader.nextLine();

        System.out.println("Enter password:");
        String password = inputReader.nextLine();

        Document userDoc = userCollection.find(new Document("username", username)).first();
        if (userDoc != null && userDoc.getString("password").equals(password)) {
            System.out.println("Login successful!");
            return userDoc.getObjectId("_id").toString();
        } else {
            System.out.println("Invalid credentials!");
            return null;
        }
    }



//
//    public User signUp(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    public User login(String username, String password) {
//        User user = userRepository.findByUsername(username);
//        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
//            return user;
//        }
//        return null;
//    }
}
