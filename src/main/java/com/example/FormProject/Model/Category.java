package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "category")
public class Category {

    @Id
    private String id;
    private String categoryName;
    private long price;
    private long weight;

    
}
