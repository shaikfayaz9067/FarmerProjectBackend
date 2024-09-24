package com.example.FormProject.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.FormProject.Model.Product;
import com.example.FormProject.Model.Subcategory;
import com.example.FormProject.Model.Category;
import com.example.FormProject.Services.ProductService;
import com.example.FormProject.Services.SubCategoryService;
import com.example.FormProject.Services.CategoryService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SubCategoryService subCategoryService;

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    // GET: Get all products (used when viewing the product list, initially not called)
    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // POST: Add a new product (called during checkout with a list of products)
    @PostMapping("/checkout")
    public ResponseEntity<Void> checkoutProducts(@RequestBody List<Product> products) {
        logger.info("Checking out products: {}", products);
        productService.saveAllProducts(products);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

    // DELETE: Delete a product by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/categories")
    public ResponseEntity<String> addCategories(@RequestBody Category category){
        logger.info("the Category is added",category);
        categoryService.save(category);

        return new ResponseEntity<>("The Categery is added",HttpStatus.CREATED);
        
    }

    // GET: Get all categories (for the category dropdown)
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
     @GetMapping("/categories/subcategories")
     public ResponseEntity<List<Subcategory>> getSubCategories() {
         List<Subcategory> subcategories = subCategoryService.getAllCategories();
         return new ResponseEntity<>(subcategories, HttpStatus.OK);
     }
    
     @PostMapping("/categories/subcategories")
    public ResponseEntity<String> addCategories(@RequestBody Subcategory subcategory){
        logger.info("the Category is added",subcategory);
        subCategoryService.save(subcategory);

        return new ResponseEntity<>("The subCategery is added",HttpStatus.CREATED);
        
    }
}
