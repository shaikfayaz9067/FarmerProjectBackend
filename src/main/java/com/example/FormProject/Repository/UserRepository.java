package com.example.FormProject.Repository;


import com.example.FormProject.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // You can define custom query methods here if needed
}
