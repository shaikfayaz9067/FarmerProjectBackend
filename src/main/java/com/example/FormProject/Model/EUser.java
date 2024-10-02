package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "eusers")
public class EUser {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    
    public EUser() {}
}
