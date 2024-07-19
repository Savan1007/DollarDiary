package com.example.demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnector {

    public static MongoDatabase getDatabase(){
        MongoClient client = MongoClients.create("mongodb+srv://root:root@cluster0.5rj5cvx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
        return client.getDatabase("Demo");
    }
}
