package com.example.FormProject.Repository;

import com.example.FormProject.Model.EUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EUserRepository extends MongoRepository<EUser, String> {
    EUser findByEmail(String email);

    EUser findByUsername(String username);
}
