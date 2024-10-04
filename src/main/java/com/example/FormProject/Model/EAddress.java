package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Eaddress")
public class EAddress {

    @Id
    private String id; // Unique identifier for the address
    private String userId; // The ID of the user to whom the address belongs
    private String street; // Street address
    private String city; // City
    private String state; // State
    private String zipCode; // Zip code
    private String country; // Country

    public EAddress() {
    }
}
