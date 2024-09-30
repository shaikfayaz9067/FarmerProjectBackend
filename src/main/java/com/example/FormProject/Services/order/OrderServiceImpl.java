package com.example.FormProject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FormProject.Model.Order;
import com.example.FormProject.Repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired 
    OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> createAllOrders(List<Order> orders) {
        return orderRepository.saveAll(orders);
    }

    @Override
    public Optional<Order> getOrder(String id) {
        return orderRepository.findById(id);
    }
    
}
