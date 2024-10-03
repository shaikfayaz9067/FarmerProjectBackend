package com.example.FormProject.Repository;

import com.example.FormProject.Model.ECart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ECartRepository extends MongoRepository<ECart, String> {
    List<ECart> findByUserId(String userId); // Custom method to find cart items by user ID
    void deleteByProductIdAndUserId(String productId, String userId);
}
