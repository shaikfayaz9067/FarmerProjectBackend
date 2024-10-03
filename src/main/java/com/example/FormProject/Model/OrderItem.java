package com.example.FormProject.Model;

import lombok.Data;

@Data
public class OrderItem {
    private long productId; // Assuming productId is long
    private int quantity;
    private double price;
}
