package com.example.FormProject.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FormProject.Model.Subcategory;

public interface SubCategoryRepository extends MongoRepository<Subcategory, String> {


    
}
