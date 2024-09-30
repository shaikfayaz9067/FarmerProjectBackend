package com.example.FormProject.Repository;

import com.example.FormProject.Model.EOrder;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EOrderRepository extends MongoRepository<EOrder, String> {
    // You can define custom query methods here if needed
    List<EOrder> findByUserId(String userId); // Optional: method to find orders by userId
}
