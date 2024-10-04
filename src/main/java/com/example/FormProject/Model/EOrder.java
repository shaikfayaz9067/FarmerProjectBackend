package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import java.util.*;;

@Data
@Document(collection = "Eorders")
public class EOrder {

    @Id
    private String id;
    private String userId; // User ID as a string to match frontend
    private String email;
    private EAddress shippingAddress;
    private String contact;
    private double totalAmount; // Renamed to totalAmount to match frontend
    private String status; // Order status
    private List<OrderItem> items; // List of order items

    // Default constructor
    public EOrder() {
    }

    // Constructor with parameters
    public EOrder(String userId, String email, EAddress address, String contact, double totalAmount, String status, List<OrderItem> items) {
        this.userId = userId;
        this.email = email;
        this.shippingAddress = address;
        this.contact = contact;
        this.totalAmount = totalAmount;
        this.status = status;
        this.items = items;
    }
}
