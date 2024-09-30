package com.example.FormProject.Services.eorder;

import com.example.FormProject.Model.EOrder;

import java.util.List;
import java.util.Optional;

public interface EOrderService {
    EOrder createOrder(EOrder order);
    List<EOrder> getAllOrders();
    Optional<EOrder> getOrderById(String id);
    EOrder updateOrder(String id, EOrder order);
    void deleteOrder(String id);
    List<EOrder> getOrdersByUserId(String userId); // Optional: method to get orders by userId
}
