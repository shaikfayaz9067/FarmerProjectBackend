package com.example.FormProject.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "transport")
public class Transport {
    private String vehicleType;
    private int vehicleNumber;
    private String vehiclePhoto;
    private Long driverPhoneNumber;

}
