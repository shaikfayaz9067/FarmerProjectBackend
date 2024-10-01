package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "eproducts")
public class EProduct {

    @Id
    private String id;
    private String name;
    private long price;
    private String category;
    private String color;
    private byte[] image;
    private String description;
    private int quantity;
    private Long productId; // Using Long instead of Number for compatibility with Java

    public EProduct() {
    }
}
