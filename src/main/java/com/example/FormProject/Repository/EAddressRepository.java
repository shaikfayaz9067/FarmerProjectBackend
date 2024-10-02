package com.example.FormProject.Repository;

import com.example.FormProject.Model.EAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EAddressRepository extends MongoRepository<EAddress, String> {
    List<EAddress> findByUserId(String userId);
}
