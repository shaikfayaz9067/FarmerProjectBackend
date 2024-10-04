package com.example.FormProject.Services.ecart;

import com.example.FormProject.Model.ECart;

import java.util.List;
import java.util.Optional;

public interface ECartService {
    ECart addToCart(ECart cart);
    List<ECart> getAllCarts();
    List<ECart> getCartsByUserId(String userId);
    Optional<ECart> getCartById(String id);
    ECart updateCart(String id, ECart cart);

    void deleteCart(String id);

    public void removeCartItem(String productId, String userId);

    public void deleteCartItemsByUserId(String userId);
}
