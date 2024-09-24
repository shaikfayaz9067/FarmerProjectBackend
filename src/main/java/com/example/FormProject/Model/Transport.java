package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "transport")
public class Transport {
    @Id
    private String id;                     // Optional ID
    private String vehicleType;             // Type of vehicle
    private String vehicleNumber;           // Vehicle registration number
    private String vehiclePhoto;            // Photo URL or path as a String
    private Long driverPhoneNumber;         // Driver's phone number
    private String driverName;              // Driver's name
    private int capacity;                   // Vehicle capacity
    private double transportAmount;         // Amount for transport
    private Double loadingAmount;           // Amount related to loading
    private Double unloadingAmount; // Amount related to unloading
    private int weight;
    private boolean weightExceeded;

    public Transport() {
    }
}
