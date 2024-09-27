package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Base64;

import lombok.Data;

@Data
@Document(collection = "transport")
public class Transport {
    @Id
    private String id;                     // Optional ID
    private String vehicleType;             // Type of vehicle
    private String vehicleNumber;           // Vehicle registration number
    private byte[] vehiclePhoto;             // Photo URL or path as a String
    private String vehiclePhotoContentType;
    private Long driverPhoneNumber;         // Driver's phone number
    private String driverName;              // Driver's name
    private int capacity;                   // Vehicle capacity
    private double transportAmount;         // Amount for transport
    private Double loadingAmount;           // Amount related to loading
    private Double unloadingAmount; // Amount related to unloading
    private int weight;
    private int waybill;
    private boolean weightExceeded;



// public void setVehiclePhoto(String base64Image) {
//     this.vehiclePhoto = Base64.getDecoder().decode(base64Image);
// }


    public Transport() {
    }
}
