package com.example.FormProject.Model;

import lombok.Data;

@Data
public class OrderItem {
    private String productId; // Changed to String to match frontend
    private int quantity;
    private double price; // price as a double
}

