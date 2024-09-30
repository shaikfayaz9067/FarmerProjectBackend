package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class EOrder {

    @Id
    private String id;
    private String email;
    private String address;
    private String contact;
    private long totalPrice;
    private String userId; // Assuming userId is a string
     // Using Long instead of Number for compatibility with Java

    public EOrder() {
    }
}
