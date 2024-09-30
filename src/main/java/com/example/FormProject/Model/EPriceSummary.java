package com.example.FormProject.Model;

import lombok.Data;

@Data
public class EPriceSummary {
    private long price;
    private long discount;
    private long tax;
    private long delivery;
    private long total;

    public EPriceSummary() {
    }
}
