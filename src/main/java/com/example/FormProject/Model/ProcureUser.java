package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "procureusers")
public class ProcureUser {

    @Id
    private String id;
    private String username;
    private String password;
}
