package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

public class InventoryUser {

@Data
@Document(collection = "inventoryusers")
public class ProcureUser {

    @Id
    private String id;
    private String username;
    private String password;
}
    
}
