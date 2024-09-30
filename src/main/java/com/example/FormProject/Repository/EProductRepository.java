package com.example.FormProject.Repository;

import com.example.FormProject.Model.EProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EProductRepository extends MongoRepository<EProduct, String> {
    // You can define custom query methods here if needed
}
