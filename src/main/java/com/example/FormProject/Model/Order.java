package com.example.FormProject.Model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "orders")
public class Order {

    @Id
    private String id;
    private String farmerName;
    private Long phoneNumber;
    private List<Product> products;
    private Transport transport;
    private long totalAmountAllProducts;
    private Date purchaseDate;


}
