package com.example.FormProject.Services.ecart;

import com.example.FormProject.Model.ECart;
import com.example.FormProject.Repository.ECartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ECartServiceImpl implements ECartService {

    @Autowired
    private ECartRepository cartRepository;

    @Override
    public ECart addToCart(ECart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<ECart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public List<ECart> getCartsByUserId(String userId) {
        return cartRepository.findByUserId(userId);
    }

    @Override
    public Optional<ECart> getCartById(String id) {
        return cartRepository.findById(id);
    }

    @Override
    public ECart updateCart(String id, ECart cart) {
        if (cartRepository.existsById(id)) {
            cart.setId(id);
            return cartRepository.save(cart);
        } else {
            return null;
        }
    }

    // Delete cart item by product ID and user ID
    @Override
    public void removeCartItem(String productId, String userId) {
        cartRepository.deleteByProductIdAndUserId(productId, userId);
    }

    @Override
    public void deleteCart(String id) {
        cartRepository.deleteById(id);
    }

    @Override
        public void deleteCartItemsByUserId(String userId) {
        cartRepository.deleteByUserId(userId);
    }

}
