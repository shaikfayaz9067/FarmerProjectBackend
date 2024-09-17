package com.example.FormProject.Services;

import java.util.List;
import java.util.Optional;

import com.example.FormProject.Model.Order;


public interface OrderService {

    List<Order> getOrders();
    public Optional<Order> getOrder(String id);
    public Order createOrder(Order order);
    public void deleteOrder(String id);
    public List<Order> createAllOrders(List<Order> orders);
    
}
