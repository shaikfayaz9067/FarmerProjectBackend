package com.example.FormProject.Services.product;

import java.util.List;

import com.example.FormProject.Model.Product;



public interface ProductService {
     public List<Product> getAllProducts();

    public Product createProduct(Product product);

    public void deleteProduct(String id) ;

    public void saveAllProducts(List<Product> products);
    
    Product getProductById(String id);

}
