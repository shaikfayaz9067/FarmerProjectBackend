package com.example.FormProject.Services.eorder;

import com.example.FormProject.Model.EOrder;
import com.example.FormProject.Repository.EOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EOrderServiceImpl implements EOrderService {

    @Autowired
    private EOrderRepository orderRepository;

    @Override
    public EOrder createOrder(EOrder order) {
        return orderRepository.save(order);
    }

    @Override
    public List<EOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<EOrder> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    @Override
    public EOrder updateOrder(String id, EOrder order) {
        if (orderRepository.existsById(id)) {
            order.setId(id);
            return orderRepository.save(order);
        } else {
            return null; // Or throw an exception
        }
    }

    @Override
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<EOrder> getOrdersByUserId(String userId) {
        return orderRepository.findByUserId(userId); // Optional: method to find orders by userId
    }
}
