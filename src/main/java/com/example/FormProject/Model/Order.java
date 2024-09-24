package com.example.FormProject.Model;

import java.util.ArrayList;
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
    private List<Product> products=new ArrayList<>();
    private List<Transport> transport = new ArrayList<>();  // Changed from Transport to List<Transport>
    private long totalAmountAllProducts;
    private Date purchaseDate;
    private String purchaseLocation;
    private boolean amountStatus;
    private String bagtype;
    // private Address address;
}
