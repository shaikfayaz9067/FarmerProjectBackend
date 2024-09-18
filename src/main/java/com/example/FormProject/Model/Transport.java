package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "transport")
public class Transport {
    @Id
    private String id;
    private String vehicleType;
    private String vehicleNumber;
    private String vehiclePhoto;
    private Long driverPhoneNumber;

}
