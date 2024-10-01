package com.example.FormProject.Controllers;

import com.example.FormProject.Model.EProduct;
import com.example.FormProject.Services.eproduct.EProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eproducts")
@CrossOrigin({"http://localhost:4200","http://localhost:5000"}) // Adjust or remove based on your needs
public class EProductController {

    @Autowired
    private EProductService productService;

    @PostMapping
    public ResponseEntity<EProduct> createProduct(@RequestBody EProduct product) {
        EProduct createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EProduct>> getAllProducts() {
        List<EProduct> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EProduct> getProductById(@PathVariable String id) {
        Optional<EProduct> product = productService.getProductById(id);
        return product.map(p -> new ResponseEntity<>(p, HttpStatus.OK))
                      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EProduct> updateProduct(@PathVariable String id, @RequestBody EProduct product) {
        EProduct updatedProduct = productService.updateProduct(id, product);
        return updatedProduct != null ? new ResponseEntity<>(updatedProduct, HttpStatus.OK)
                                      : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
