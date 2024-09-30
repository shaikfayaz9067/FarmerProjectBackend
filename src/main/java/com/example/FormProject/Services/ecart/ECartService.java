package com.example.FormProject.Services;

import com.example.FormProject.Model.ECart;
import java.util.List;
import java.util.Optional;

public interface ECartService {
    ECart createCart(ECart cart);
    List<ECart> getAllCarts();
    Optional<ECart> getCartById(String id);
    ECart updateCart(String id, ECart cart);
    void deleteCart(String id);
    List<ECart> getCartsByUserId(long userId); // Method to get carts by user ID
}
