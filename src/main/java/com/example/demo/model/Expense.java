package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "expenses")
public class Expense {

    private String userId;
    private Category category;
    private String description;
    private double amount;
    private String date;
}
