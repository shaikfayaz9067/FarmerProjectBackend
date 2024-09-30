package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class ECart {
    @Id
     private String id;
    private String name;
    private long price;
    private String category;
    private String color;
    private String image;
    private String description;
    // Using Long instead of Number for compatibility with Java
    private int quantity;
    private long productId; // Changed to long to match your TypeScript definition
    private long userId; // Assuming userId is also a long

    public ECart() {
    }
}
