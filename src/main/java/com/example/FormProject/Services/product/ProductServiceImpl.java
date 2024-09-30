package com.example.FormProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormProject.Model.Product;
import com.example.FormProject.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

     @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public void saveAllProducts(List<Product> products) {

       productRepository.saveAll(products);
    }
    
}
