package com.example.FormProject.Model;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String state;
    private String city;
    private String townOrVillage;
    private String houseNumber;
    private int pincode;  
}
