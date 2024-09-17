package com.example.FormProject.Repository;

import com.example.FormProject.Model.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
    
}
