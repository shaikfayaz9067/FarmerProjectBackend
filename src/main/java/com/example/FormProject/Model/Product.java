package com.example.FormProject.Model;





import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private Category category;
    private int quantity; 
    private long price; 
    private long totalPrice; // Additional field

    // Getter and setter for totalPrice
    // public long getTotalPrice() {
    //     return price * quantity;
    // }
    
}
