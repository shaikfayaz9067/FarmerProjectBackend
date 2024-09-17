package com.example.FormProject.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FormProject.Model.Order;
import com.example.FormProject.Services.OrderService;

@RestController
@RequestMapping("api/orders")
@CrossOrigin("http://localhost:4200")
public class OrderController {

    @Autowired
    OrderService orderService;

    // Get all orders
    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        List<Order> orders = orderService.getOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    // Get a single order by ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable String id) {
        Optional<Order> order = orderService.getOrder(id);
        return order.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Create a single order
    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    // Create multiple orders
    @PostMapping("/createAll")
    public ResponseEntity<List<Order>> createOrders(@RequestBody List<Order> orders) {
        orderService.createAllOrders(orders);
        return new ResponseEntity<>(orders, HttpStatus.CREATED);
    }
}
