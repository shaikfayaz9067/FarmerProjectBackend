package com.example.FormProject.Services.category;
import com.example.FormProject.Model.Category;

import java.util.List;


public interface CategoryService {

    public List<Category> getAllCategories();

    public void save(Category category);
    
}
