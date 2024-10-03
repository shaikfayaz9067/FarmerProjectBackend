package com.example.FormProject.Controllers;

import com.example.FormProject.Model.ECart;
import com.example.FormProject.Services.ecart.ECartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ecarts")
@CrossOrigin({"http://localhost:4200","http://localhost:5000","http://localhost:3000"})
public class ECartController {

    @Autowired
    private ECartService cartService;

    // Add a product to the cart
    @PostMapping
    public ResponseEntity<ECart> addToCart(@RequestBody ECart cart) {
        ECart createdCart = cartService.addToCart(cart);
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }

    // Get all cart items (global)
    @GetMapping
    public ResponseEntity<List<ECart>> getAllCarts() {
        List<ECart> carts = cartService.getAllCarts();
        return new ResponseEntity<>(carts, HttpStatus.OK);
    }

    // Get cart items by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ECart>> getCartsByUserId(@PathVariable String userId) {
        List<ECart> userCarts = cartService.getCartsByUserId(userId);
        return new ResponseEntity<>(userCarts, HttpStatus.OK);
    }

    // Get a specific cart item by cart ID
    @GetMapping("/{id}")
    public ResponseEntity<ECart> getCartById(@PathVariable String id) {
        Optional<ECart> cart = cartService.getCartById(id);
        return cart.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                   .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update a cart item
    @PutMapping("/{id}")
    public ResponseEntity<ECart> updateCart(@PathVariable String id, @RequestBody ECart cart) {
        ECart updatedCart = cartService.updateCart(id, cart);
        return updatedCart != null ? new ResponseEntity<>(updatedCart, HttpStatus.OK)
                                   : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Remove a cart item by product ID and user ID
    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> removeCartItem(@PathVariable String productId, @RequestParam String userId) {
        cartService.removeCartItem(productId, userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
