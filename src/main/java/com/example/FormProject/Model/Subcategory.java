package com.example.FormProject.Model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Subcategory {
    @Id
    private String id;
    private String name;
    private String subname;
    private int price;
}
