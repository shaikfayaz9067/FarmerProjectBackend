package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class ECart {
    @Id
    private String id;  // Unique ID for the cart item
    private String productId; // Changed to String to match the frontend definition
    private int quantity; // Keep track of the quantity in the cart
    private long userId; // Assuming userId is also needed to associate with the user

    public ECart() {
    }
}
