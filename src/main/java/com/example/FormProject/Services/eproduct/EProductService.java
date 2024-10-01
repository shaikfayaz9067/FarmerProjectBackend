package com.example.FormProject.Services.eproduct;

import com.example.FormProject.Model.EProduct;

import java.util.List;
import java.util.Optional;

public interface EProductService {
    EProduct createProduct(EProduct product);

    List<EProduct> getAllProducts();
    Optional<EProduct> getProductById(String id);
    EProduct updateProduct(String id, EProduct product);

    void deleteProduct(String id);

    List<EProduct> createProducts(List<EProduct> products);
}
