package com.example.FormProject.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.FormProject.Model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    
}
