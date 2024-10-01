package com.example.FormProject.Services.category;

import java.util.List;
import com.example.FormProject.Model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormProject.Repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
     
       return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        // TODO Auto-generated method stub
        categoryRepository.save(category);
    }
    
}
