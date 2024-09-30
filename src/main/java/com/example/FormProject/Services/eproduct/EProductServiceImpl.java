package com.example.FormProject.Services.eproduct;

import com.example.FormProject.Model.EProduct;
import com.example.FormProject.Repository.EProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EProductServiceImpl implements EProductService {

    @Autowired
    private EProductRepository productRepository;

    @Override
    public EProduct createProduct(EProduct product) {
        return productRepository.save(product);
    }

    @Override
    public List<EProduct> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<EProduct> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public EProduct updateProduct(String id, EProduct product) {
        if (productRepository.existsById(id)) {
            product.setId(id); // Ensure the ID is set for the update
            return productRepository.save(product);
        } else {
            return null; // Or throw an exception
        }
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
