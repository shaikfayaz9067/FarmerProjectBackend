package com.example.FormProject.Repository;

import com.example.FormProject.Model.Transport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends MongoRepository<Transport, String> {
    // You can define custom query methods here if needed
}
