package com.example.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private String id;
    private String username;
    private String email;
    private String pass;
}
//@Document
//public class User {
//
//    @Id
//    private String id;
//
//    private String name;
//
//    private String email;
//
//    private String imageUrl;
//
//    private Boolean emailVerified = false;
//
//    @JsonIgnore
//    private String password = null;
//
//    private AuthProvider provider;
//
//    private String providerId;
//}
