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
@RequestMapping("/api/carts")
@CrossOrigin("http://localhost:4200") // Adjust or remove based on your needs
public class ECartController {

    @Autowired
    private ECartService cartService;

    @PostMapping
    public ResponseEntity<ECart> createCart(@RequestBody ECart cart) {
        ECart createdCart = cartService.createCart(cart);
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ECart>> getAllCarts() {
        List<ECart> carts = cartService.getAllCarts();
        return new ResponseEntity<>(carts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ECart> getCartById(@PathVariable String id) {
        Optional<ECart> cart = cartService.getCartById(id);
        return cart.map(c -> new ResponseEntity<>(c, HttpStatus.OK))
                   .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ECart> updateCart(@PathVariable String id, @RequestBody ECart cart) {
        ECart updatedCart = cartService.updateCart(id, cart);
        return updatedCart != null ? new ResponseEntity<>(updatedCart, HttpStatus.OK)
                                   : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable String id) {
        cartService.deleteCart(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ECart>> getCartsByUserId(@PathVariable long userId) {
        List<ECart> userCarts = cartService.getCartsByUserId(userId);
        return new ResponseEntity<>(userCarts, HttpStatus.OK);
    }
}
