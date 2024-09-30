package com.example.FormProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormProject.Model.Subcategory;
import com.example.FormProject.Repository.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public List<Subcategory> getAllCategories() {
        // TODO Auto-generated method stub
        return subCategoryRepository.findAll();
    }

    @Override
    public void save(Subcategory subcategory) {
        // TODO Auto-generated method stub
        subCategoryRepository.save(subcategory);
    }
    
}
