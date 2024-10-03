package com.example.FormProject.Model;
import org.bson.types.ObjectId;
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
     private long totalPrice;
    private byte[] image;
    private String description;
     private Subcategory subcategory;

    public Product() {
    }
    
}
