package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String formerName;
    private Long phoneNumber; 
    private String category;
    private int weight; 
    private int numOfBags; 
    private long priceOfBags; // Changed from int to long
    private long totalAmount; // Changed from int to long

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }

    public long getPriceOfBags() { // Changed method name to match the updated field
        return priceOfBags;
    }

    public void setPriceOfBags(long priceOfBags) { // Changed method name to match the updated field
        this.priceOfBags = priceOfBags;
    }

    public long getTotalAmount() { // Changed method name to match the updated field
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) { // Changed method name to match the updated field
        this.totalAmount = totalAmount;
    }
}
