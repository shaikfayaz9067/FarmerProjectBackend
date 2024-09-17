package com.example.FormProject.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.FormProject.Model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{

    
}
